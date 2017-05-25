/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.model.Informacion;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Juan Neira
 */
@Stateless
@Path("com.model.informacion")
public class InformacionFacadeREST extends AbstractFacade<Informacion> {

    @PersistenceContext(unitName = "practica4PU")
    private EntityManager em;

    public InformacionFacadeREST() {
        super(Informacion.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Informacion entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Integer id, Informacion entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Informacion find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Override
    @Path("/json")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_JSON})
    public List<Informacion> findAll() {
        return super.findAll();
    }
    
    @POST
    @Path("consulta")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_JSON})
    public List<Informacion> consulta(@FormParam("usuario") String usuario, @FormParam("contraseña") int contraseña){
        List<Informacion> retorno= null;
        if (usuario.equals("kathya") && contraseña==12345){
            retorno=super.findAll();
        }
        return retorno;
    }
    
    @POST
    @Path("consultarvalidos")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_JSON})
    public List<Informacion> consultarvalidos(@FormParam("eliminado") boolean eliminado) {
        List<Informacion> retorno=obtenerporeliminado(eliminado);
        return retorno;
    }
    
    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Informacion> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    List<Informacion> obtenerporeliminado(boolean valor){
        TypedQuery<Informacion> gry;
        gry=getEntityManager().createQuery("SELECT i FROM Informacion i WHERE i.usuarioEliminado = :usuarioEliminado", Informacion.class);
        gry.setParameter("usuarioEliminado", valor);
        try{
            return gry.getResultList();
        }catch(NoResultException e){
            return null;
        }
    }
    
}
