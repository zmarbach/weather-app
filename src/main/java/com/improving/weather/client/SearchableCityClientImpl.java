package com.improving.weather.client;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SearchableCityClientImpl implements SearchableCityClient{

    private final RestTemplate restTemplate;

    public SearchableCityClientImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public City searchByCityName(String cityName){
        return restTemplate.getForObject("http://api.openweathermap.org/data/2.5/weather?q={cityName}&APPID=d315aa37741ec9a6e5e1386d7512097d", City.class, cityName);
    }

}

