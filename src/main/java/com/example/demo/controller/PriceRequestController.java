package com.example.demo.controller;

import com.example.demo.request.PriceRequest;
import com.example.demo.response.PriceResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PriceRequestController {
    @RequestMapping(value = "/price", method = RequestMethod.POST)
    public ResponseEntity<PriceResponse> priceRequest(@RequestBody PriceRequest request){

        PriceResponse response = new PriceResponse();
        response.setPrice(20);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
