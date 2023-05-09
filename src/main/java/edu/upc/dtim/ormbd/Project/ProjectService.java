package edu.upc.dtim.ormbd.Project;

import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

@Service
public class ProjectService {

    public Project savePerson(Project project) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("UnidadPersonas");
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(project); // persist the person object
            em.getTransaction().commit();
            System.out.println("VALORES INSERTADOS --------------------------------------");

        } catch (Exception e) {
            System.out.println("ERRORRRR --------------------------------------");
            e.printStackTrace();
        } finally {
            em.close();
        }
        System.out.println("FIN MAIN --------------------------------------");

        return project;
    }

    public Project getProject(String id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("UnidadPersonas");
        EntityManager em = emf.createEntityManager();
        Project project = null;
        try {
            project = em.find(Project.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
        return project;
    }

    public List<Project> getAllProjects() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("UnidadPersonas");
        EntityManager em = emf.createEntityManager();
        List<Project> projects = null;
        try {
            Query query = em.createQuery("SELECT p FROM Project p");
            projects = query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
        return projects;
    }

    public boolean deleteProject(String id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("UnidadPersonas");
        EntityManager em = emf.createEntityManager();
        boolean success = false;
        try {
            em.getTransaction().begin();
            Project project = em.find(Project.class, id);
            if (project != null) {
                em.remove(project);
                success = true;
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
        return success;
    }

    public boolean deleteAllProjects() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("UnidadPersonas");
        EntityManager em = emf.createEntityManager();
        boolean success = false;
        try {
            em.getTransaction().begin();
            Query query = em.createQuery("DELETE FROM Project");
            int deletedCount = query.executeUpdate();
            em.getTransaction().commit();
            success = deletedCount > 0;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
        return success;
    }
}
