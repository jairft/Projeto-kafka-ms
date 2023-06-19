package com.jairfreitas.strproducer.controller;

import com.jairfreitas.strproducer.service.StrtingProducerService;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/producer")
public class StringProducerController {

    @Autowired
    private StrtingProducerService producerService;

    @PostMapping
    public ResponseEntity<String> sendMessage(@RequestBody String message){
        producerService.sendMessage(message);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
