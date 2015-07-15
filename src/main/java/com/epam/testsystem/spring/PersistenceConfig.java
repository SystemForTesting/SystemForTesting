package com.epam.testsystem.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jndi.JndiTemplate;
import org.springframework.orm.hibernate4.HibernateExceptionTranslator;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.jta.JtaTransactionManager;

import javax.mail.Session;
import javax.naming.NamingException;
import javax.persistence.EntityManagerFactory;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages="com.epam.testsystem.repository")
public class PersistenceConfig {
    @Bean
    public HibernateExceptionTranslator hibernateExceptionTranslator(){
        return new HibernateExceptionTranslator();
    }

    @Bean
    public EntityManagerFactory entityManagerFactory() throws NamingException {
        JndiTemplate jndi = new JndiTemplate();
        EntityManagerFactory emf = (EntityManagerFactory) jndi.lookup("java:/emf");
        return emf;
    }

    @Bean
    public Session session() throws NamingException {
        JndiTemplate jndi = new JndiTemplate();
        Session session = (Session) jndi.lookup("java:jboss/mail/gmail");
        return session;
    }

    @Bean
    public PlatformTransactionManager transactionManager(){
        return new JtaTransactionManager();
    }
}
