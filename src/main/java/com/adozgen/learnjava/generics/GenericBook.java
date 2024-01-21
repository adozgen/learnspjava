package com.adozgen.learnjava.generics;

import com.adozgen.learnjava.collection.Book;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GenericBook implements GenericRepository<Book> {
    @Override
    public void save(Book Entity) {

    }

    @Override
    public Optional<Book> findById(Long id) {
        return Optional.empty();
    }
}
