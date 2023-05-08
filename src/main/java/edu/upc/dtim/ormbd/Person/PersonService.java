package edu.upc.dtim.ormbd.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
@Service
public class PersonService {
    public Person savePerson(Person person) {
        Person yo = person;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("UnidadPersonas");
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();

            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("UnidadPersonas");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            entityManager.getTransaction().begin();
            entityManager.persist(yo);
            entityManager.getTransaction().commit();
            System.out.println("VALORES INSERTADOS --------------------------------------");
        } catch (Exception e) {
            System.out.println("ERRORRRR --------------------------------------");
            e.printStackTrace();

        } finally {
            entityManager.close();
        }

        System.out.println("FIN MAIN --------------------------------------");

        return yo;
    }
}
