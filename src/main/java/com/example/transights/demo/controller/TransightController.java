package com.example.transights.demo.controller;

import com.example.transights.demo.service.PlaceService;
import com.example.transights.demo.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/transight")
public class TransightController {

    @Autowired
    PriceService priceService;

    @Autowired
    PlaceService placeService;


    @PostMapping("/price")
    public int getPriceByDepartureAndDestination( ) {
//        return priceService.getPriceByDepartureAndDestination()
        return 0;
    }
}
