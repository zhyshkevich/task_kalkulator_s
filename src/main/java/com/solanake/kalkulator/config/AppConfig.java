package com.solanake.kalkulator.config;

import com.solanake.kalkulator.config.cloudant.CloudantConfig;
import com.solanake.kalkulator.config.cloudant.CountriesDatabaseConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Import({
        CloudantConfig.class,
        CountriesDatabaseConfig.class,
})
@PropertySources({
        @PropertySource("classpath:database.properties")
})
public class AppConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
