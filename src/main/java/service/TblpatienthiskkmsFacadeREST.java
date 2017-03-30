/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.Tblpatienthiskkms;
import java.math.BigInteger;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author emafazillah
 */
@Stateless
@Path("/tblpatienthiskkms")
public class TblpatienthiskkmsFacadeREST extends AbstractFacade<Tblpatienthiskkms> {

    @PersistenceContext(unitName = "mywildflyrestv2_mywildflyrestv2_war_1.0PU")
    private EntityManager em;

    public TblpatienthiskkmsFacadeREST() {
        super(Tblpatienthiskkms.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_JSON})
    public void create(Tblpatienthiskkms entity) {
        super.create(entity);
    }

    @PUT
    @Path("/{id}")
    @Consumes({MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Long id, Tblpatienthiskkms entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("/{id}")
    public void remove(@PathParam("id") Long id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Tblpatienthiskkms find(@PathParam("id") Long id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_JSON})
    public List<Tblpatienthiskkms> findAll() {
        return super.findAll();
    }

    @GET
    @Path("/{from}/{to}")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Tblpatienthiskkms> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("/count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }
    
    @GET
    @Path("/patientid/{patientid}")
    @Produces({MediaType.APPLICATION_JSON})
    public Tblpatienthiskkms findByPatientId(@PathParam("patientid") BigInteger patientid) {
        javax.persistence.Query q = em.createQuery("SELECT t FROM Tblpatienthiskkms t WHERE t.patientid = :patientid ORDER BY t.date DESC");
        q.setParameter("patientid", patientid);
        q.setMaxResults(1);
        return (Tblpatienthiskkms) q.getSingleResult();
    }
    
    @GET
    @Path("/listpatientid/{patientid}")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Tblpatienthiskkms> listFindByPatientId(@PathParam("patientid") BigInteger patientid) {
        javax.persistence.Query q = em.createQuery("SELECT t FROM Tblpatienthiskkms t WHERE t.patientid = :patientid ORDER BY t.date DESC");
        q.setParameter("patientid", patientid);
        return q.getResultList();
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
