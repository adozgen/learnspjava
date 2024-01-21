package com.adozgen.learnjava.genericCollectionExamples;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Example1 {
    public static void createHashMap(){
/*        Map<String, Integer> map = new HashMap<>();
        map.put("Bir", 1);
        map.put("İki", 2);
        map.put("Üç", 3);

        String result = map.entrySet().stream()
                .map(entry -> entry.getKey() + " = " + entry.getValue())
                .collect(Collectors.joining());

        System.out.println(result);*/

/*        List<String> list = List.of("elma", "armut", "elma", "çilek", "armut", "elma");
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String item : list) {
            frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
        }
        System.out.println(frequencyMap);*/

    }
}
