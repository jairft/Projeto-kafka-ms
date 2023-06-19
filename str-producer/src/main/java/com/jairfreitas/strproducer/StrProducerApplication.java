package com.jairfreitas.strproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
public class StrProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(StrProducerApplication.class, args);
    }

}
