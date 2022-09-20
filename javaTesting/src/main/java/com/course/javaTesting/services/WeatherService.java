package com.course.javaTesting.services;

import com.course.javaTesting.models.Weather;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {
    public Weather getWeather() {
        Weather weather = new Weather();
        weather.setMaxTemp(10);
        weather.setMinTemp(8);
        weather.setStatus("Cloudy");
        return weather;
    }
}
