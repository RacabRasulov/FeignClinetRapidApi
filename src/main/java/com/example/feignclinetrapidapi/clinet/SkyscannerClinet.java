package com.example.feignclinetrapidapi.clinet;


import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "sky", url = "https://skyscanner50.p.rapidapi.com/api/v1/searchFlightEverywhere?origin=LOND&anytime=true&oneWay=false&currency=USD&countryCode=US&market=en-US")

public interface SkyscannerClinet {

//    @GetMapping("get")
//    @Headers({"X-RapidAPI-Key: 986c90ca04msh30bbd236af9a4ebp129098jsnec98afe4c653",
//            "X-RapidAPI-Host: skyscanner50.p.rapidapi.com"})
//    String get();
}
