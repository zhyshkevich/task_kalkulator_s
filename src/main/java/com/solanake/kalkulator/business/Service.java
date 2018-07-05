package com.solanake.kalkulator.business;

import com.solanake.kalkulator.business.cloudant.CloudantModel;

import java.io.Serializable;
import java.util.List;

public interface Service<T extends CloudantModel, PK extends Serializable> {

    String create(T entity);

    T findOne(PK id);

    T findByUuid(String uuid);

    T findByCountryName(String countryName);

    boolean update(T entity);

    void delete(PK id);

    List<T> findAll();

    void bulkUpdate(List<T> objects);

}
