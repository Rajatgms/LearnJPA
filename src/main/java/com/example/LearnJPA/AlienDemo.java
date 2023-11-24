package com.example.LearnJPA;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class AlienDemo {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Alien alien = new Alien("Rajat", "Blue");
        entityManager.getTransaction().begin();
        entityManager.persist(alien);
        entityManager.getTransaction().commit();

        Alien result = entityManager.find(Alien.class, 1);
        System.out.println(result.getName());
    }
}
