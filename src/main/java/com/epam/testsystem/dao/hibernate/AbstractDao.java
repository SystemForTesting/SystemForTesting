package com.epam.testsystem.dao.hibernate;

import com.epam.testsystem.model.BaseEntity;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;


public abstract class AbstractDao<T extends BaseEntity> {
    @Inject
    protected EntityManager em;

    protected AbstractDao() {
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

    public T findById(int id) {
        return (T)em.find(getEntityClass(), id);
    }

    public List<T> findAll() {
        List<T> result = new ArrayList<T>();

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<T> cq = cb.createQuery(getEntityClass());
        Root<T> rootEntry = cq.from(getEntityClass());
        CriteriaQuery<T> all = cq.select(rootEntry);
        TypedQuery<T> allQuery = em.createQuery(all);

        return allQuery.getResultList();
    }

    protected abstract Class getEntityClass();
}
