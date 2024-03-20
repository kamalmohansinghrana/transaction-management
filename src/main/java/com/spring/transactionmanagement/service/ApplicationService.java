package com.spring.transactionmanagement.service;

import com.spring.transactionmanagement.model.Application;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApplicationService implements IApplicationService{
    @Override
    public List<Application> getAllApplications() {
        return new ArrayList<>();
    }
}
