package com.epam.testsystem.dao.hibernate;

import com.epam.testsystem.dao.UserDao;
import com.epam.testsystem.model.User;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class UserDaoImpl extends AbstractDao<User> implements UserDao {
    public UserDaoImpl(EntityManager em) {
        super(em);
    }

    @Override
    public User findByCredentials(User user) {
        TypedQuery<User> query = em.createQuery("select u from User u where lower(u.username) = " +
                "lower('" + user.getUsername() + "') and u.password = '" + user.getPassword() + "'", User.class);
        User result = query.getSingleResult();
        return result;
    }
}
