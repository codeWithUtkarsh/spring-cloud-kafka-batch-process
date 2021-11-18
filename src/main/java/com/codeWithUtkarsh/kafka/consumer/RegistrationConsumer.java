package com.codeWithUtkarsh.kafka.consumer;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.stereotype.Service;

import com.codeWithUtkarsh.kafka.model.Registration;

import static com.codeWithUtkarsh.kafka.binding.StreamBindings.ApplicationStreams.REGISTRATIONS_INBOUND;

import java.time.OffsetDateTime;
import java.util.List;

@Service
public class RegistrationConsumer {

    static long counter = 0;

    @StreamListener(REGISTRATIONS_INBOUND)
    void consume(List<GenericMessage<Registration>> messages) {
        counter += messages.size();
        OffsetDateTime now = OffsetDateTime.now();
        System.out.println("Received "+ messages.size() +" messages at "+now.toString()+" total so far "+counter);
    }
}
