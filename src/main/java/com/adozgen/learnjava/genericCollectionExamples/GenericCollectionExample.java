package com.adozgen.learnjava.genericCollectionExamples;


import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class GenericCollectionExample {
    @PostConstruct
    public void init(){
        Example1.createHashMap();
    }
}
