package com.codeWithUtkarsh.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.codeWithUtkarsh.kafka.binding.StreamBindings;

@SpringBootApplication
@EnableScheduling
@EnableBinding(StreamBindings.class)
public class KafkaApplication {
	public static void main(String[] args) {
        SpringApplication.run(KafkaApplication.class, args);
    }
}
