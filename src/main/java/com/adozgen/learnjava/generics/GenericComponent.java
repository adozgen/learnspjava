package com.adozgen.learnjava.generics;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class GenericComponent {
    @PostConstruct
    public void init(){
        Pair<String, Integer> pair1 = new Pair<>("apple", 1);
        Pair<String, Integer> pair2 = new Pair<>("banana", 2);
        int comparison = pair1.compareTo(pair2);
        System.out.println(comparison);
    }
}
