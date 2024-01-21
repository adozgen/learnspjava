package com.adozgen.learnjava.javabeans.resource;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageSourceConfig {
    @Bean(name = "emailMessage")
    public Message emailMessage() {
        return new EmailMessage();
    }

    @Bean(name = "smsMessage")
    public Message smsMessage() {
        return new SmsMessage();
    }
}
