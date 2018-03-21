package dhbw.wpvs.ows.controller;

import dhbw.wpvs.ows.entity.ListWeather;
import dhbw.wpvs.ows.service.WeatherConstants;
import dhbw.wpvs.ows.service.WeatherService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static dhbw.wpvs.ows.service.WeatherConstants.*;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @RequestMapping("/now/{country}/{city}")
    public ListWeather getWeather(@PathVariable String country,
                                  @PathVariable String city) {
        return this.weatherService.getWeather(WEATHER_URL, country, city);
    }

    @RequestMapping("/weekly/{country}/{city}")
    public ListWeather getWeatherForecast(@PathVariable String country,
                                              @PathVariable String city) {
        return this.weatherService.getWeather(FORECAST_URL, country, city);
    }
}

