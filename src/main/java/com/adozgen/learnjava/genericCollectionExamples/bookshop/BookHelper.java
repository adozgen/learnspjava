package com.adozgen.learnjava.genericCollectionExamples.bookshop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookHelper {
    public static Comparator<Book> priceComparator = new Comparator<Book>() {
        @Override
        public int compare(Book b1, Book b2) {
            return Double.compare(b1.getPrice(), b2.getPrice());
        }
    };

    public Book findMaxByPrice(List<Book> books){
        if (books == null || books.isEmpty()){
            return null;
        }

        return Collections.max(books, priceComparator);
    }

    public List<Book> sortByPriceDescending(List<Book> books) {
        List<Book> sortedBooks = new ArrayList<>(books);
        sortedBooks.sort(priceComparator.reversed());
        return sortedBooks;
    }
}
