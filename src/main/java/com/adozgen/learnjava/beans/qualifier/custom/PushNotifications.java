package com.adozgen.learnjava.beans.qualifier.custom;

import org.springframework.stereotype.Component;

@Component
@CommunicationChannel(CommunicationChannel.ChannelType.PUSH_NOTIFICATION)
public class PushNotifications implements MessageService {
    @Override
    public void sendMessage(String message) {
        // Push bildirimi gönderimi
    }
}
