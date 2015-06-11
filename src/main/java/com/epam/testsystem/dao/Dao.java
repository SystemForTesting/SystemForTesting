package com.epam.testsystem.dao;

import com.epam.testsystem.model.BaseEntity;

import java.util.List;

public interface Dao<T extends BaseEntity>{
    void insert(T entity);
    void update(T entity);
    void delete(T entity);

    T findById(Long id);
    List<T> findAll();
}
