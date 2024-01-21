package com.adozgen.learnjava.javabeans.resource;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    @Resource(name = "smsMessage")
    private Message smsMessage;
}
