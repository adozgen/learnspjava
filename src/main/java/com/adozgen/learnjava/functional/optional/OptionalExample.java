package com.adozgen.learnjava.functional.optional;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class OptionalExample {
    @PostConstruct
    public void init(){
        String isNull = null;
        String isNotNull = "Merhaba Dünya";

        Optional<String> optNull = Optional.ofNullable(isNull);
        Optional<String> optNotNull = Optional.ofNullable(isNotNull);

        System.out.println("isNull mevcut mu? " + optNull.isPresent()); // false
        System.out.println("isNotNull mevcut mu? " + optNotNull.isPresent()); // true
        String nullString = null;
        String result = Optional.ofNullable(nullString).orElse("Varsayılan Değer");
        System.out.println(result); // "Varsayılan Değer" yazdırır
        Optional<String> optString = Optional.of("Merhaba");
        optString.ifPresent(System.out::println); // "Merhaba" yazdırır
        String sonuc = Optional.of("test")
                .map(String::toUpperCase)
                .orElse("Boş");
        System.out.println(sonuc); // "TEST" yazdırır




    }
}
