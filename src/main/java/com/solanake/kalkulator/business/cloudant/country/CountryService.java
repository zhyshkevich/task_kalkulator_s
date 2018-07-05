package com.solanake.kalkulator.business.cloudant.country;

import com.solanake.kalkulator.business.cloudant.CloudantService;
import com.solanake.kalkulator.utils.DateGenerator;
import com.solanake.kalkulator.utils.UuidGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService extends CloudantService<CountryModel, CountryRepository> {

    private UuidGenerator uuidGenerator;
    private DateGenerator dateGenerator;

    @Autowired
    public CountryService(CountryRepository countryRepository,
                          UuidGenerator uuidGenerator,
                          DateGenerator dateGenerator){
        super(countryRepository);
        this.uuidGenerator = uuidGenerator;
        this.dateGenerator = dateGenerator;
    }

    @Override
    public String create(CountryModel entity) {
        entity.setUuid(uuidGenerator.generateUUID());
        entity.setDateCreated(dateGenerator.generateDate());
        return super.create(entity);
    }
}
