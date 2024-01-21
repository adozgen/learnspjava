package com.adozgen.learnjava.beanlifecycle.lazyLoading;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class ReportConfig {

    @Lazy
    @Bean
    public ReportGenerator reportGenerator() {
        return new ReportGenerator();
    }
}
