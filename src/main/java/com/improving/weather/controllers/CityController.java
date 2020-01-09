package com.improving.weather.controllers;

import com.improving.weather.client.City;
import com.improving.weather.client.ICityClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CityController {

    private ICityClient cityClient;

    public CityController(ICityClient cityClient) {
        this.cityClient = cityClient;
    }

    @GetMapping("/search/{cityName}")
    public ResponseEntity<City> searchByCityName(@PathVariable String cityName){
        var result = cityClient.searchByCityName(cityName);

        if(result != null){
            return new ResponseEntity<>(result, HttpStatus.OK);
        }

        else{
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

}
