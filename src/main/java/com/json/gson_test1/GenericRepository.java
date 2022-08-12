package com.json.gson_test1;

public interface GenericRepository<T,ID> {
    T created();
    T updated(T t);

}
