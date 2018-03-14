package dhbw.wpvs.ows.service;

import dhbw.wpvs.ows.entity.ListWeather;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriTemplate;

import java.net.URI;

import static dhbw.wpvs.ows.service.WeatherConstants.*;

@Service
public class WeatherService {

    private final RestTemplate restTemplate;

    public WeatherService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public ListWeather getWeather(String url, String city, String country) {
        URI uri = new UriTemplate(url).expand(city, country, APP_ID);
        RequestEntity<?> request = RequestEntity.get(uri).accept(MediaType.APPLICATION_JSON).build();
        ResponseEntity<ListWeather> response = this.restTemplate.exchange(request, ListWeather.class);
        return response.getBody();
    }
}