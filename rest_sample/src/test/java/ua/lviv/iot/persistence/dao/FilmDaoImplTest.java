package ua.lviv.iot.persistence.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

import ua.lviv.iot.model.Film;

class FilmDaoImplTest {

    @Test
    public void testManager() {

        EntityManager em2 = Persistence.
                createEntityManagerFactory("test_manager").
                createEntityManager();
        FilmDaoImpl daoImpl = new FilmDaoImpl();
        daoImpl.setEntityManager(em2);
        
        // magic starts here
        daoImpl.persist(new Film("Transformers", "SONY"));
        daoImpl.findById(1);
        daoImpl.findById(2);
        daoImpl.findById(3);
    }

}
