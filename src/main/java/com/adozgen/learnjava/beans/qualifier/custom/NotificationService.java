package com.adozgen.learnjava.beans.qualifier.custom;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    private final MessageService messageService;

    public NotificationService(@CommunicationChannel(CommunicationChannel.ChannelType.PUSH_NOTIFICATION) MessageService messageService) {
        this.messageService = messageService;
    }
}
