package com.epam.testsystem.util;

import javax.enterprise.inject.Produces;
import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Singleton
public class Resources {

    @Produces
    @PersistenceContext(unitName = "primary")
    @SuppressWarnings("unused")
    private EntityManager em;

}
