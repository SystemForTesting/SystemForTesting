package com.epam.testsystem.dao.hibernate;

import com.epam.testsystem.dao.Jpa;
import com.epam.testsystem.dao.UserDao;
import com.epam.testsystem.model.DBUser;

import javax.ejb.Stateless;

@Stateless
@Jpa
public class UserDaoImpl extends AbstractDao<DBUser> implements UserDao {

    @Override
    protected Class getEntityClass() {
        return DBUser.class;
    }
}
