package com.educandoweb.aplicacao;
import com.educandoweb.dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        Pessoa p = em.find(Pessoa.class,2);
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();


        System.out.println("Done!");
        em.close();
        emf.close();
    }
}