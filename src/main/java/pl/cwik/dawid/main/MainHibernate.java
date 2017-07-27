package pl.cwik.dawid.main;

import pl.cwik.dawid.entity.Users;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by mc111364 on 2017-07-27.
 */
public class MainHibernate {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dc-JPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Users user = new Users();
        System.out.println("###########find");
        user = entityManager.find(Users.class, 1L);
        System.out.println(user);

    }
}
