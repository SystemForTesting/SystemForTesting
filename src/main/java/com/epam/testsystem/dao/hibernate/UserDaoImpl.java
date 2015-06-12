package com.epam.testsystem.dao.hibernate;

import com.epam.testsystem.dao.UserDao;
import com.epam.testsystem.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

public class UserDaoImpl extends AbstractDao<User> implements UserDao {
    private static final Logger LOG= LoggerFactory.getLogger(UserDaoImpl.class);

    public UserDaoImpl(EntityManager em) {
        super(em);
    }

    @Override
    public User findByCredentials(User user) {
        TypedQuery<User> query = em.createQuery("select u from User u where lower(u.username) = " +
                "lower('" + user.getUsername() + "') and u.password = '" + user.getPassword() + "'", User.class);
        try {
            User result = query.getSingleResult();
            return result;
        } catch(NoResultException e) {
            LOG.warn("Could not find user with username {} and password {}", user.getUsername(), user.getPassword(), e);
        }
        return null;
    }

    @Override
    public User findByName(String username) {
        TypedQuery<User> query = em.createQuery("select u from User u where lower(u.username) = " +
                "lower('" + username + "')", User.class);
        try {
            User result = query.getSingleResult();
            return result;
        } catch(NoResultException e) {
            LOG.warn("Could not find user with username {}", username, e);
        }
        return null;
    }
}
