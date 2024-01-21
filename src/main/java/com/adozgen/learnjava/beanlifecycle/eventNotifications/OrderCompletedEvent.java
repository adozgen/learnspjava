package com.adozgen.learnjava.beanlifecycle.eventNotifications;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class OrderCompletedEvent extends ApplicationEvent {
    private final Order order;
    public OrderCompletedEvent(Object source, Order order) {
        super(source);
        this.order = order;
    }
}
