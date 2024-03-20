package com.spring.transactionmanagement.service;

import com.spring.transactionmanagement.model.Ticket;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TicketService implements ITicketService{
    @Override
    public List<Ticket> getAllTickets() {
        return new ArrayList<>();
    }
}
