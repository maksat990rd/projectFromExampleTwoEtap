package org.example.config;

import org.example.example.Course;
import org.example.example.Instructor;
import org.example.example.Lesson;
import org.example.example.Task;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import javax.persistence.EntityManager;
import java.util.Properties;

public class Config {
    public static SessionFactory getSession() {
        try {
            return new Configuration().configure("hibernate.cfg.xml")
                    .addAnnotatedClass(Task.class)
                    .addAnnotatedClass(Lesson.class)
                    .addAnnotatedClass(Course.class)
                    .addAnnotatedClass(Instructor.class)
                    .buildSessionFactory();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

//    public static SessionFactory getSessionFactory() {
//        Configuration configuration = new Configuration();
//        Properties proper = new Properties();
//        proper.setProperty(Environment.DRIVER, "org.postgresql.Driver");
//        proper.setProperty(Environment.USER, "postgres");
//        proper.setProperty(Environment.PASS, "parola1d2t3");
//        proper.setProperty(Environment.URL, "jdbc:postgresql://localhost:5432/hibernate");
//        proper.setProperty(Environment.SHOW_SQL, "true");
//        proper.setProperty(Environment.HBM2DDL_AUTO, "create");
//        proper.setProperty(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
//        configuration.setProperties(proper);
//        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
//        return configuration.buildSessionFactory(serviceRegistry);
//    }
//
//    public static EntityManager getEntityManager() {
//        return getSessionFactory().createEntityManager();
//    }
}
