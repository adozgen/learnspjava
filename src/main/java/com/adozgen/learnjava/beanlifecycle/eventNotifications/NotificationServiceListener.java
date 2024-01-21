package com.adozgen.learnjava.beanlifecycle.eventNotifications;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationServiceListener {

    @EventListener
    public void onOrderCompleted(OrderCompletedEvent event) {
        Order order = event.getOrder();
        // Kullanıcıya sipariş tamamlandı bildirimi gönder
    }
}
