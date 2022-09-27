package com.vtb.kortunov.lesson19;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Factory {

    private final SessionFactory sessionFactory;

    public Factory() {
        this.sessionFactory = buildSessionFactory();
    }

    private SessionFactory buildSessionFactory() {
        return new Configuration()
            .configure("hibernate.cfg.xml")
            .buildSessionFactory();
    }

    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public void shutdown() {
        sessionFactory.close();
    }
}
