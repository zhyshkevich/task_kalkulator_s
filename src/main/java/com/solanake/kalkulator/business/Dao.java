package com.solanake.kalkulator.business;

import com.solanake.kalkulator.business.cloudant.CloudantModel;

import java.io.Serializable;
import java.util.List;

public interface Dao<T extends CloudantModel, PK extends Serializable> {

    String create(T entity);

    T findOne(PK id);

    T findByUuid(String uuid);

    List<T> findAll();

    boolean update(T entity);

    void delete(PK id);

    void bulkUpdate(List<T> objects);

}
