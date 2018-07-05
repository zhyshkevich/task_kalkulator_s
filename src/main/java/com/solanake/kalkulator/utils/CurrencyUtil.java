package com.solanake.kalkulator.utils;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CurrencyUtil {

    public Double getCurrencyRate(String currencyCode){
        RestTemplate restTemplate = new RestTemplate();

        String result = restTemplate.getForObject("http://api.nbp.pl/api/exchangerates/rates/C/"
                + currencyCode.toUpperCase() + "/?format=json", String.class);

        JsonParser parser = new JsonParser();
        JsonObject jsonObject = parser.parse(result).getAsJsonObject();
        JsonArray jsonArray = jsonObject.get("rates").getAsJsonArray();
        JsonObject currency = jsonArray.get(0).getAsJsonObject();

        return currency.get("ask").getAsDouble();
    }
}
