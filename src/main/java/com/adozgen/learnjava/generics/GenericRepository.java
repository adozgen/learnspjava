package com.adozgen.learnjava.generics;

import java.util.Optional;

public interface GenericRepository<T> {
    void save(T Entity);
    Optional<T> findById(Long id);
}
