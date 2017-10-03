/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.jpa.repository;

/**
 *
 * @author Orly
 */




import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public abstract class Baserepository <T>{
   
    private EntityManager em;
    private String unitPersistence;
    private final EntityManagerFactory emf;
    private final Class entityClass;

    public Baserepository(String unitPersistence, Class entityClass) {
        this.unitPersistence = unitPersistence;
        emf = Persistence.createEntityManagerFactory(this.unitPersistence);
        this.entityClass=entityClass;

    }

    /**
     * Méthode de création
     *
     * @param obj
     * @return boolean
     * @throws SQLException
     */
    public boolean create(T obj) throws SQLException {
        em.persist(obj);
        return true;
    }

    /**
     * Méthode pour effacer
     *
     * @param obj
     * @return boolean
     * @throws java.sql.SQLException
     */
    public boolean delete(T obj) throws SQLException {
        em.remove(obj);
        return true;
    }

    /**
     * Méthode de mise à jour
     *
     * @param obj
     * @return boolean
     * @throws java.sql.SQLException
     */
    public boolean update(T obj) throws SQLException {
        em.merge(obj);
        return true;
    }

    /**
     * Méthode de recherche des informations
     *
     * @param propertyName
     * @param value
     * @return T
     * @throws java.sql.SQLException
     */
    public T findByProperty(String propertyName, Object value) throws SQLException {

        String className = entityClass.getClass().getSimpleName();
        String query = "select t from " + className + " t where t." + propertyName + "=:param";
        Query qry = getEm().createQuery(query);
        qry.setParameter("param", value);
        return (T) qry.getSingleResult();

    }

    /*
	  * Méthode de recherche de tous les objets
     */
    public abstract List<T> findAll() throws SQLException;

    public EntityManager getEntityManager() {
        EntityManagerFactory emf;
        emf = Persistence.createEntityManagerFactory(getUnitPersistence());
        setEm(emf.createEntityManager());
        return getEm();
    }

    /**
     * @return the em
     */
    public EntityManager getEm() {
        return em;
    }

    /**
     * @param em the em to set
     */
    public void setEm(EntityManager em) {
        this.em = em;
    }

    /**
     * @return the unitPersistence
     */
    public String getUnitPersistence() {
        return unitPersistence;
    }

    /**
     * @param UnitPersistence the unitPersistence to set
     */
    public void setUnitPersistence(String UnitPersistence) {
        this.unitPersistence = UnitPersistence;
    }
    
}

    

