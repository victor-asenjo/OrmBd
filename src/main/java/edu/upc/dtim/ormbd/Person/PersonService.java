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
        person.setName("Asenjo");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("UnidadPersonas");
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(person); // persist the person object
            em.getTransaction().commit();
            System.out.println("VALORES INSERTADOS --------------------------------------");

        } catch (Exception e) {
            System.out.println("ERRORRRR --------------------------------------");
            e.printStackTrace();
        } finally {
            em.close();
        }
        System.out.println("FIN MAIN --------------------------------------");

        return person;
    }
}
