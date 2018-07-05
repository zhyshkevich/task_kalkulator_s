package com.solanake.kalkulator.business.cloudant;

import com.cloudant.client.api.Database;
import com.cloudant.client.api.views.Key;
import com.solanake.kalkulator.business.Dao;
import com.solanake.kalkulator.exception.CountriesRuntimeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.List;

import static com.cloudant.client.api.views.SettableViewParameters.STALE_OK;

public abstract class CloudantRepository<T extends CloudantModel> implements Dao<T, String> {

    private static final Logger LOG = LoggerFactory.getLogger(CloudantRepository.class);

    private final Database database;
    private final Class<T> type;
    private final String getByUuidView;
    private final String getAllView;

    @Autowired
    public CloudantRepository(Database database,
                              Class<T> type,
                              String getByUuidView,
                              String getAllView) {
        this.database = database;
        this.type = type;
        this.getByUuidView = getByUuidView;
        this.getAllView = getAllView;
    }

    @Override
    public String create(T entity) {
        return database.save(entity).getId();
    }

    @Override
    public T findOne(String id) {
        return database.find(type, id);
    }

    @Override
    public T findByUuid(String id) {
        List<T> models = null;
        try {
            models = database.getViewRequestBuilder(getByUuidView, getByUuidView)
                    .newRequest(Key.Type.STRING, type)
                    .stale(STALE_OK)
                    .includeDocs(true)
                    .keys(id)
                    .build()
                    .getResponse()
                    .getDocsAs(type);
        } catch (IOException e) {
            LOG.error("Cannot connect to the database", e);
        }
        return models.get(0);
    }

    @Override
    public List<T> findAll() {
        try {
            return database.getViewRequestBuilder(getAllView, getAllView)
                    .newRequest(Key.Type.STRING, type)
                    .stale(STALE_OK)
                    .includeDocs(true)
                    .build()
                    .getResponse()
                    .getDocsAs(type);
        } catch (IOException e) {
            throw new CountriesRuntimeException(e);
        }
    }

    @Override
    public boolean update(T entity) {
        return database.update(entity).getError() == null;
    }

    @Override
    public void delete(String id) {
        T entity = findOne(id);
        entity.setDeleted(true);
        database.update(entity);
    }

    @Override
    public void bulkUpdate(List<T> objects) {
        database.bulk(objects);
    }
}
