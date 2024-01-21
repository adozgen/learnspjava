package com.adozgen.learnjava.genericCollectionExamples.bookshop;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
    private String title;
    private int pageCount;
    private double price;
}
