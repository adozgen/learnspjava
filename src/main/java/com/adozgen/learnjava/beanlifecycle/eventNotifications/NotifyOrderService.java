package com.adozgen.learnjava.beanlifecycle.eventNotifications;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class NotifyOrderService {
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void notifyOrder(Order order){
        //sipariş işlemleri sonrası event fırlat
        applicationEventPublisher.publishEvent(new OrderCompletedEvent(this, order));
    }

}
