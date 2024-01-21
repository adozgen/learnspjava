package com.adozgen.learnjava.beans.qualifier.custom;


import org.springframework.stereotype.Component;

@Component
@CommunicationChannel(CommunicationChannel.ChannelType.EMAIL)
public class EmailService implements MessageService{
    @Override
    public void sendMessage(String message) {
        // E-posta gönderimi
    }
}
