package com.example.feignclinetrapidapi.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class SkyscannerControllerRest {



    @RequestMapping(value = "/sky")
    public ResponseEntity<?> skyInfo() {

        HttpHeaders headers = new HttpHeaders();
        headers.set("X-RapidAPI-Key", "986c90ca04msh30bbd236af9a4ebp129098jsnec98afe4c653");
        headers.set("X-RapidAPI-Host", "skyscanner50.p.rapidapi.com");

        HttpEntity<String> entity = new HttpEntity<>("body", headers);

        RestTemplate restTemplate = new RestTemplate();

       ResponseEntity<String> exchange= restTemplate.exchange("https://skyscanner50.p.rapidapi.com/api/v1/searchFlightEverywhere?origin=LOND&anytime=true&oneWay=false&currency=USD&countryCode=US&market=en-US"
                , HttpMethod.GET, entity, String.class);
       
        return new ResponseEntity<>(exchange, HttpStatus.OK);

    }
}
