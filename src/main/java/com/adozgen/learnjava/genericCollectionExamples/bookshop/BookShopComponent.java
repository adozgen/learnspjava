package com.adozgen.learnjava.genericCollectionExamples.bookshop;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class BookShopComponent {
    @PostConstruct
    private void init(){
        List<Book> books = new ArrayList<>();
        books.add(new Book("java",100, 50.5));
        books.add(new Book("php",150, 70.5));
        books.add(new Book("go",180, 80.5));
        books.add(new Book("python",150, 150.5));
        books.add(new Book("rust",130, 250.5));

        // 1. Toplam Sayfa Sayısını Hesaplama
        int totalPageCount = books.stream().mapToInt(Book::getPageCount).sum();
        System.out.println("Toplam Sayfa Sayısı: " + totalPageCount);

        // 2. En Pahalı Kitabın Adını Bulma
        Book mostExpensiveBook = books.stream().max(Comparator.comparingDouble(Book::getPrice)).orElse(null);
        System.out.println("En Pahalı Kitap: " + (mostExpensiveBook != null ? mostExpensiveBook.getTitle() : "Sepet Boş"));

        // 3. Kitapları Sayfa Sayısına Göre Azalan Sırada Listeleme
        List<Book> sortedBooks = books.stream().sorted(Comparator.comparingInt(Book::getPageCount).reversed()).collect(Collectors.toList());
        System.out.println("Sayfa Sayısına Göre Sıralı Kitaplar: " + sortedBooks.stream().map(Book::getTitle).collect(Collectors.toList()));

        BookHelper bookHelper = new BookHelper();
        Book expensiveBook = bookHelper.findMaxByPrice(books);
        System.out.println("En Pahalı Kitap: " + (expensiveBook != null ? expensiveBook.getTitle() : "Sepet Boş"));

        List<Book> sortedBooks2 = bookHelper.sortByPriceDescending(books);
        System.out.println("Fiyata Göre Sıralı Kitaplar: " + sortedBooks2.stream().map(Book::getTitle).collect(Collectors.toList()));




    }
}
