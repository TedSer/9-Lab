package ua.lviv.iot.persistence.dao;

import java.io.Serializable;

import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ua.lviv.iot.model.Film;

@Named
@Dependent
public class FilmDaoImpl extends AbstractDao<Film> implements FilmDao, Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    protected Class<Film> getEntityClass() {
        return Film.class;
    }

    //@Resource
    //private UserTransaction userTransaction;

}
