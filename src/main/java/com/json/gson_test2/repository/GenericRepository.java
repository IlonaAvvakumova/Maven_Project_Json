package com.json.gson_test2.repository;

import java.util.List;

public interface GenericRepository<T, ID> {
    List<T> getAll();

    T getById(ID id);

    T creade(T t);

    T update(T t);

    void deleteById(ID id);
}
