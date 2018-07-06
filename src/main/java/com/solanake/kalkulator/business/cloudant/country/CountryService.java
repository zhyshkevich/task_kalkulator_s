package com.solanake.kalkulator.business.cloudant.country;

import com.solanake.kalkulator.business.cloudant.CloudantService;
import com.solanake.kalkulator.utils.CurrencyUtil;
import com.solanake.kalkulator.utils.DateGenerator;
import com.solanake.kalkulator.utils.UuidGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService extends CloudantService<CountryModel, CountryRepository> {

    private final Double NUMBER_OF_DAYS = 22.0;

    private UuidGenerator uuidGenerator;
    private DateGenerator dateGenerator;
    private CurrencyUtil currencyUtil;

    @Autowired
    public CountryService(CountryRepository countryRepository,
                          UuidGenerator uuidGenerator,
                          DateGenerator dateGenerator,
                          CurrencyUtil currencyUtil){
        super(countryRepository);
        this.uuidGenerator = uuidGenerator;
        this.dateGenerator = dateGenerator;
        this.currencyUtil = currencyUtil;
    }

    @Override
    public String create(CountryModel entity) {
        entity.setUuid(uuidGenerator.generateUUID());
        entity.setDateCreated(dateGenerator.generateDate());
        return super.create(entity);
    }


    public Double calculateEarnings(String countryName, Double dailyEarning){
        CountryModel countryModel = findByCountryName(countryName);
        Double currency;

        if ("poland".equals(countryName.toLowerCase().trim()) ||
                "pln".equals(countryModel.getCurrencyCode().toLowerCase().trim())){
            currency = 1.0;
        } else {
            currency = currencyUtil.getCurrencyRate(countryModel.getCurrencyCode());
        }

        Double result = dailyEarning * NUMBER_OF_DAYS;
        result = result - ((result * countryModel.getTax()) / 100.0) - countryModel.getCost();
        return result * currency;
    }
}
