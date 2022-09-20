package com.course.javaTesting.controllers;

import com.course.javaTesting.models.Weather;
import com.course.javaTesting.services.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    @Autowired
    private WeatherService service;

    @GetMapping(value = "/api/weather")
    public Weather getWeather() {

        return service.getWeather();
    }
}
