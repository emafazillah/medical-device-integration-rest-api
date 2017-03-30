/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.Tblpatienthiskkm;
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
@Path("/tblpatienthiskkm")
public class TblpatienthiskkmFacadeREST extends AbstractFacade<Tblpatienthiskkm> {

    @PersistenceContext(unitName = "mywildflyrestv2_mywildflyrestv2_war_1.0PU")
    private EntityManager em;

    public TblpatienthiskkmFacadeREST() {
        super(Tblpatienthiskkm.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_JSON})
    public void create(Tblpatienthiskkm entity) {
        super.create(entity);
    }

    @PUT
    @Path("/{id}")
    @Consumes({MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Long id, Tblpatienthiskkm entity) {
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
    public Tblpatienthiskkm find(@PathParam("id") Long id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_JSON})
    public List<Tblpatienthiskkm> findAll() {
        return super.findAll();
    }

    @GET
    @Path("/{from}/{to}")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Tblpatienthiskkm> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
    public Tblpatienthiskkm findByPatientId(@PathParam("patientid") BigInteger patientid) {
        javax.persistence.Query q = em.createQuery("SELECT t FROM Tblpatienthiskkm t WHERE t.patientid = :patientid ORDER BY t.date DESC");
        q.setParameter("patientid", patientid);
        q.setMaxResults(1);
        return (Tblpatienthiskkm) q.getSingleResult();
    }
    
    @GET
    @Path("/listpatientid/{patientid}")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Tblpatienthiskkm> listFindByPatientId(@PathParam("patientid") BigInteger patientid) {
        javax.persistence.Query q = em.createQuery("SELECT t FROM Tblpatienthiskkm t WHERE t.patientid = :patientid ORDER BY t.date DESC");
        q.setParameter("patientid", patientid);
        return q.getResultList();
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
