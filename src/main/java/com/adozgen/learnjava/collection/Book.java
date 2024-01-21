package com.adozgen.learnjava.collection;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

public class Book implements Comparable<Book>{
    private String name;

    @Setter
    @Getter
    private int pageCount;
    private String authorName;
    private LocalDate publishDate;

    public Book(String name, int pageCount, String authorName, LocalDate publishDate) {
        this.name = name;
        this.pageCount = pageCount;
        this.authorName = authorName;
        this.publishDate = publishDate;
    }

    // Getters and setters...

    @Override
    public int compareTo(Book other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pageCount=" + pageCount +
                ", authorName='" + authorName + '\'' +
                ", publishDate=" + publishDate +
                '}';
    }
}
