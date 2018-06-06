package ua.lviv.iot.rest.service;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import ua.lviv.iot.model.Film;
import ua.lviv.iot.persistence.dao.FilmDao;

@Path("/students")
@SessionScoped
public class FilmService implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Inject
    private FilmDao dao;

    @GET
    @Path("{id}/")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Film getStudent(@PathParam("id") Integer id) {
        return dao.findById(id);
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Film updateStudent(Film film) {
        System.out.println(film.getСompanyName());
        return film;
    }
    
    @PUT
    public Response createStudent(Film film) {
        dao.persist(film);
        return Response.ok().build();
    }
    
}
