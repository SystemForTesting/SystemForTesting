package com.epam.testsystem.dao.hibernate;

import com.epam.testsystem.model.BaseEntity;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractDao<T extends BaseEntity> {
    protected final EntityManager em;
    private final Class<T> entityClass;

    public AbstractDao(EntityManager em) {
        this.em = em;
        this.entityClass = (Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];
    }

    @Transactional
    public void insert(T entity) {
        em.persist(entity);
    }

    @Transactional
    public void update(T entity) {
        em.merge(entity);
    }

    @Transactional
    public void delete(T entity) {
        em.remove(entity);
    }

    public T findById(Long id) {
        return (T)em.find(entityClass, id);
    }

    public List<T> findAll() {
        List<T> result = new ArrayList<T>();

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<T> cq = cb.createQuery(entityClass);
        Root<T> rootEntry = cq.from(entityClass);
        CriteriaQuery<T> all = cq.select(rootEntry);
        TypedQuery<T> allQuery = em.createQuery(all);

        return allQuery.getResultList();
    }
}
