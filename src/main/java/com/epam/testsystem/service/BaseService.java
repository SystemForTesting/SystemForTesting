package com.epam.testsystem.service;

import com.epam.testsystem.model.BaseEntity;
import com.epam.testsystem.repository.BaseRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class BaseService<E extends BaseEntity> {

    protected BaseRepository<E> repository;

    protected BaseService(BaseRepository<E> repository) {
        this.repository = repository;
    }

    @Transactional
    public E findById(Long id) {
        return repository.findOne(id);
    }

    @Transactional
    public List<E> findAll() {
        return (List<E>) repository.findAll();
    }

    @Transactional
    public void delete(Long id) {
        repository.delete(id);
    }

    @Transactional
    public E save(E e) {
        return repository.save(e);
    }
}
