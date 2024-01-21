package com.adozgen.learnjava.beans.qualifier.custom;

import org.springframework.stereotype.Component;

@Component
@CommunicationChannel(CommunicationChannel.ChannelType.SMS)
public class SmsService implements MessageService {
    @Override
    public void sendMessage(String message) {
        // SMS gönderimi
    }
}
