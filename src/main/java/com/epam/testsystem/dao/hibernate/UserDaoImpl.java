package com.epam.testsystem.dao.hibernate;

import com.epam.testsystem.dao.Jpa;
import com.epam.testsystem.dao.UserDao;
import com.epam.testsystem.model.User;

import javax.ejb.Stateless;

@Stateless
@Jpa
public class UserDaoImpl extends AbstractDao<User> implements UserDao {

    @Override
    protected Class getEntityClass() {
        return User.class;
    }
}
