package com.adozgen.learnjava.beanlifecycle.eventNotifications;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class InitDestroyComponent {
    @PostConstruct
    public void init() {
        // Başlangıç mantığı
    }
    @PreDestroy
    public void cleanup() {
        // Temizleme mantığı
    }
}
