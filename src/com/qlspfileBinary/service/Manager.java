package com.qlspfileBinary.service;

public interface Manager<T> {
    void add(T t);
    void show();
    T findByName(String name);
}
