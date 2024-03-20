package com.spring.transactionmanagement.dao;

import com.spring.transactionmanagement.model.Application;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ApplicationDao implements IApplicationDao{
    @PersistenceContext
    EntityManager em;

    @Override
    public List<Application> getAllApplications(){
        String query = "select a from Application a order by  a.name";
        return (List<Application>) em.createQuery(query).getResultList();
    }
    @Override
    public Application getApplicationById(int applicationId){
        return em.find(Application.class,applicationId);
    }

//    public Application addApplication(Application application){
//        return em.persist(application);
//    }


}
