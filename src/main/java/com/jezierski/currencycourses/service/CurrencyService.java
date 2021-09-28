package com.jezierski.currencycourses.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CurrencyService {

    public static final String CURRENCY_RATES_URL = "http://api.nbp.pl/api/exchangerates/tables/C/2017-03-03";
    private RestTemplate restTemplate = new RestTemplate();

    public String getCurrenciesCTableForGivenDay(){
        return restTemplate.getForObject(CURRENCY_RATES_URL, String.class);
    }
}
