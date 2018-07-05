package com.solanake.kalkulator.business.cloudant;


import com.solanake.kalkulator.business.Service;

import java.util.List;

public class CloudantService<T extends CloudantModel, D extends CloudantRepository<T>> implements Service<T, String> {

    private D dao;

    public CloudantService() {
    }

    public CloudantService(D dao){
        this.dao = dao;
    }

    @Override
    public String create(T entity) {
        return dao.create(entity);
    }

    @Override
    public T findOne(String id) {
        return dao.findOne(id);
    }

    @Override
    public T findByUuid(String uuid) { return dao.findByUuid(uuid); }

    @Override
    public boolean update(T entity) {
        return dao.update(entity);
    }

    @Override
    public void delete(String id) {
        dao.delete(id);
    }

    @Override
    public List<T> findAll() {
        return dao.findAll();
    }

    @Override
    public void bulkUpdate(List<T> objects) {
        dao.bulkUpdate(objects);
    }
}
