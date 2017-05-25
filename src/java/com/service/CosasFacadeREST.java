/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.model.Cosas;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
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
@Path("com.model.cosas")
public class CosasFacadeREST extends AbstractFacade<Cosas> {

    @PersistenceContext(unitName = "practica4PU")
    private EntityManager em;

    public CosasFacadeREST() {
        super(Cosas.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Cosas entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") String id, Cosas entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") String id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Cosas find(@PathParam("id") String id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_JSON})
    public List<Cosas> findAll() {
        return super.findAll();
    }
    
    @POST
    @Path("consulta")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_JSON})
    public List<Cosas> consulta(@FormParam("usuario") String usuario, @FormParam("contraseña") int contraseña){
        List<Cosas> retorno= null;
        if (usuario.equals("kathya") && contraseña==12345){
            retorno=super.findAll();
        }
        return retorno;
    }
    
    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Cosas> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }
    
    @POST
    @Path("contador")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_JSON})
    public String contador(@FormParam("usuario") String usuario, @FormParam("contraseña") String contraseña){
        String retorno="";
        if (usuario.equals("kathya")&& contraseña.equals("12345")){
            retorno=String.valueOf(super.count());
        }
        return retorno;
    }
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
