package com.adozgen.learnjava.beans.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Profile("prod")
public class SmtpEmailService implements EmailService{
    @Override
    public void sendEmail(String message) {
        System.out.println("Sending email using SMTP");
    }
}
