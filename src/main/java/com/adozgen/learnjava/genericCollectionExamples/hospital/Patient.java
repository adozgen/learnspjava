package com.adozgen.learnjava.genericCollectionExamples.hospital;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Patient {
    private String name;
    private int age;
    private Boolean isEmergency;
}
