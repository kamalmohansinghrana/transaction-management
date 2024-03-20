package com.spring.transactionmanagement.dao;

import com.spring.transactionmanagement.model.Application;

import java.util.List;

public interface IApplicationDao {
    List<Application> getAllApplications();

    Application getApplicationById(int applicationId);
}
