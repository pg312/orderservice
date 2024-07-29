package com.petproject.ordreService.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("orders")
public class OrderController {

    @GetMapping
    public ResponseEntity<String> getOrders(@RequestParam String userId){
        if(Math.random() % 2 ==1)
            return new ResponseEntity<>("Hello", OK);
        else
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
