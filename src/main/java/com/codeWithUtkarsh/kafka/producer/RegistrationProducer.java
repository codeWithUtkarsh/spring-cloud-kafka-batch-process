package com.codeWithUtkarsh.kafka.producer;

import java.time.OffsetDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.codeWithUtkarsh.kafka.binding.StreamBindings;
import com.codeWithUtkarsh.kafka.model.Registration;

@Service
public class RegistrationProducer {
    StreamBindings bindings;

    @Autowired
    RegistrationProducer(StreamBindings bindings) {
        this.bindings = bindings;
    }

    @Scheduled(cron = "0 0/5 * * * *")
    public void send()
    {
    	OffsetDateTime now = OffsetDateTime.now();
        System.out.println("Starting sending messages at "+now.toString());
        for (int i = 0; i < 1000000; i++)
        {
        	bindings.outboundRegistrations().send(new GenericMessage<Registration>(new Registration(i, "Utkarsh"+i)));
		}
        now = OffsetDateTime.now();
        System.out.println("Completed sending messages at"+ now.toString());
    }
}
