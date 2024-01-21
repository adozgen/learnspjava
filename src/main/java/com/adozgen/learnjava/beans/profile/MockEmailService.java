package com.adozgen.learnjava.beans.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("test")
public class MockEmailService implements EmailService{
    @Override
    public void sendEmail(String message) {
        System.out.println("Mock Email Service");
    }
}
