package ru.skillfactorydemo.telegrambot.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.skillfactorydemo.telegrambot.dto.ValuteCursOnDate;
import ru.skillfactorydemo.telegrambot.service.CentralRussianBankService;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequiredArgsConstructor
public class CurrencyController {

    private final CentralRussianBankService centralRussianBankService;

//    @PostMapping("/getCurrencies")
    @GetMapping("/getCurrencies")
    public List<ValuteCursOnDate> getValuteCursOnDate() throws Exception {
        return centralRussianBankService.getCurrenciesFromCbr();
    }

    @GetMapping("/getCurrency/{code}")
    @Operation(summary = "Получение курса определенной валюты на текущий день",
            description = "По коду, например USD/EUR/CNY и т.п.")
    public ValuteCursOnDate getCourseForCurrency(@PathVariable String code) throws Exception {
        return centralRussianBankService.getCourseForCurrency(code);
    }
}