package com.jairfreitas.strconsumer.listeners;

import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Component;
@Log4j2
@Component
public class StrConsumerListener {

    @KafkaListener(groupId = "group-1", topicPartitions = {
            @TopicPartition(topic = "str-topic01", partitions = {"0"})
    }, containerFactory = "stringContainerFactory")
    public void create(String message){
        log.info("CREATE ::: Receive message {}", message);
    }
    @KafkaListener(groupId = "group-1", topicPartitions = {
            @TopicPartition(topic = "str-topic01", partitions = {"1"})
    }, containerFactory = "stringContainerFactory")
    public void log(String message){
        log.info("LOG ::: Receive message {}", message);
    }
//    @KafkaListener(groupId = "group-1", topics = "str-topic01", containerFactory = "stringContainerFactory")
//    public void history(String message){
//        log.info("HISTORY ::: Receive message {}", message);
//    }
}
