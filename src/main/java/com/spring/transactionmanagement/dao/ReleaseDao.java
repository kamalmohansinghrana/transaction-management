package com.spring.transactionmanagement.dao;

import com.spring.transactionmanagement.model.Release;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class ReleaseDao implements IReleaseDao{
    @PersistenceContext
    private EntityManager em;

    @Override
    public void addRelease(Release release){
        em.persist(release);
    }

    @Override
    public Release getReleaseId(int releaseId){
        return em.find(Release.class, releaseId);
    }
}
