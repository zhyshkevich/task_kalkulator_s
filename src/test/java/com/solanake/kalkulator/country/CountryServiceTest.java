package com.solanake.kalkulator.country;

import com.solanake.kalkulator.business.cloudant.country.CountryModel;
import com.solanake.kalkulator.business.cloudant.country.CountryService;
import com.solanake.kalkulator.utils.CurrencyUtil;
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

    @Autowired
    CurrencyUtil currencyUtil;

    @Test
    public void testSave(){
        CountryModel countryModel = new CountryModel();

        countryModel.setCountryName("Poland");
        countryModel.setTax(19.0);
        countryModel.setCost(1200.0);
        countryModel.setCurrencyCode("EUR");

        System.out.println(countryService.create(countryModel));
    }

    @Test
    public void testGetByUuid(){
        System.out.println(countryService.findByUuid("tyty"));
    }

    @Test
    public void testGetByCountryName(){
        System.out.println(countryService.findByCountryName("poland"));
    }

    @Test
    public void testCalculations(){
        System.out.println(countryService.calculateEarnings("great britain", 658.0));
    }

    @Test
    public void testGetCurrencyRate(){
//        System.out.println(currencyUtil.getCurrencyRate("gbp"));
        currencyUtil.getCurrencyRate("gbp");
    }
}
