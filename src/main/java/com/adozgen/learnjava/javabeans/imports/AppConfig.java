package com.adozgen.learnjava.javabeans.imports;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(DatabaseConfig.class)
public class AppConfig {
    // Bu sınıfın kendi bean tanımlamaları ve AnotherConfig sınıfındaki bean tanımlamaları
}
