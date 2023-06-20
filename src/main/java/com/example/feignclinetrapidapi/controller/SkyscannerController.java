package com.example.feignclinetrapidapi.controller;

import com.example.feignclinetrapidapi.clinet.SkyscannerClinet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SkyscannerController {

//    @Autowired
//    private SkyscannerClinet skyscannerClinet;
//
//    @RequestMapping(value = "/sky")
//    public ResponseEntity<?> skyInfo(){
//        String skyScannerData =skyscannerClinet.get();
//        return new ResponseEntity<>(skyScannerData, HttpStatus.OK);
//
//    }
}
