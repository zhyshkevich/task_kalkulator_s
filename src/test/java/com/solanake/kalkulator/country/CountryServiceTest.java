package com.solanake.kalkulator.country;

import com.solanake.kalkulator.business.cloudant.country.CountryModel;
import com.solanake.kalkulator.business.cloudant.country.CountryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CountryServiceTest {

    @Autowired
    CountryService countryService;

    @Test
    public void testSave(){
        CountryModel countryModel = new CountryModel();

        countryModel.setCountryName("Test Country");
        countryModel.setTax(20.0);
        countryModel.setCost(1920.10);
        countryModel.setCurrencyCode("EUR");

        System.out.println(countryService.create(countryModel));
    }
}
