package com.jezierski.currencycourses.controller;

import com.jezierski.currencycourses.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController {

    @Autowired
    private CurrencyService currencyService;

    @GetMapping("/getCurrencies")
    public String getCurrenciesCTableForGivenDay() {
        return currencyService.getCurrenciesCTableForGivenDay();
    }
}
