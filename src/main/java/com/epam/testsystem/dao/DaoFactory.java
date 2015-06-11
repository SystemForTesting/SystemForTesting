package com.epam.testsystem.dao;

import com.epam.testsystem.dao.hibernate.DaoFactoryImpl;
import com.epam.testsystem.model.BaseEntity;

public abstract class DaoFactory {

    public static final String HIBERNATE = "hibernate";

    public static DaoFactory getInstance() {
        return getInstance(HIBERNATE);
    }

    public static DaoFactory getInstance(String type) {
        if (type == null)
            throw new NullPointerException("String parameter, representing type of DaoFactory is null");
        if (type.toLowerCase().equals(HIBERNATE))
            return DaoFactoryImpl.getInstance();
        else
            throw new DaoException("Implementation for this type does not exist");
    }
    public abstract <T extends Dao> T getDao(Class<? extends BaseEntity> clazz) throws DaoException;


}
