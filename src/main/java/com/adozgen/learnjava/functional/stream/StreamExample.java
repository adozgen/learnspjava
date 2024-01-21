package com.adozgen.learnjava.functional.stream;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class StreamExample {
    @PostConstruct
    public void init(){

    }
    private void example1(){
        List<String> isimler = Arrays.asList("Ali", "Ayşe", "Veli", "Fatma");
        isimler.stream().filter(isim->isim.startsWith("A"))
                .forEach(System.out::println);
    }
}
