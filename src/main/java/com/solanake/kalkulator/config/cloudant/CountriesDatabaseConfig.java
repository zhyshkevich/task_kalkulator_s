package com.solanake.kalkulator.config.cloudant;

import com.cloudant.client.api.CloudantClient;
import com.cloudant.client.api.Database;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;

public class CountriesDatabaseConfig {

    @Autowired
    private CloudantClient cloudantClient;

    @Bean
    @DependsOn("cloudantClient")
    public Database countriesDatabase(@Value("${cloudant.countires.dbname}") String databaseName){
        return cloudantClient.database(databaseName, true);
    }
}
