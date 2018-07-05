package com.solanake.kalkulator.business.cloudant.country;

import com.cloudant.client.api.Database;
import com.solanake.kalkulator.business.cloudant.CloudantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class CountryRepository extends CloudantRepository<CountryModel> {

    @Autowired
    public CountryRepository(
            @Qualifier("countriesDatabase") Database articlesDatabase,
            @Value("${cloudant.countires.view.getByUuid}") String getByUuidView,
            @Value("${cloudant.countires.view.getAll}") String getAllView

    ){
        super(articlesDatabase, CountryModel.class, getByUuidView, getAllView);
    }
}
