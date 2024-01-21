package com.adozgen.learnjava.beanlifecycle.methods;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class MyCommandLineRunner implements CommandLineRunner {

    private final ConfigurableApplicationContext context;

    public MyCommandLineRunner(ConfigurableApplicationContext context) {
        this.context = context;
    }

    @Override
    public void run(String... args) throws Exception {
        // Komut satırı argümanlarına göre yapılandırma değişiklikleri yap
/*        context.refresh();
        context.stop();
        context.registerShutdownHook();*/

    }

}
