package com.epam.testsystem.dao.hibernate;

import com.epam.testsystem.dao.Dao;
import com.epam.testsystem.dao.DaoException;
import com.epam.testsystem.dao.DaoFactory;
import com.epam.testsystem.model.BaseEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class DaoFactoryImpl extends DaoFactory {
    private static DaoFactoryImpl instance = new DaoFactoryImpl();

    private EntityManagerFactory emf;

    private DaoFactoryImpl() {
        this.emf = Persistence.createEntityManagerFactory("primary");
    }

    public static DaoFactoryImpl getInstance() {
        return instance;
    }

    @Override
    public <T extends Dao> T getDao(Class<? extends BaseEntity> clazz) throws DaoException {
        String entityClassName = clazz.getSimpleName();
        String implPackageName = this.getClass().getPackage().getName();
        String daoClassName = implPackageName + "." + entityClassName + "DaoImpl";

        try {
            Class<?> daoClass = Class.forName(daoClassName);
            Constructor<?> constructor = daoClass.getConstructor(EntityManager.class);
            T instance = (T) constructor.newInstance(emf.createEntityManager());
            return instance;
        } catch (ClassNotFoundException e) {
            throw new DaoException("There is no DaoImpl matching " + entityClassName, e);
        } catch (NoSuchMethodException e) {
            throw new DaoException("Dao class corresponding to " +
                    entityClassName + " does not have constructor that accepts EntityManager", e);
        } catch (InvocationTargetException | InstantiationException | IllegalAccessException e) {
            throw new DaoException("Could not instantiate dao for " + entityClassName, e);
        }
    }
}
