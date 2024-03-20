package com.spring.transactionmanagement.dao;

import com.spring.transactionmanagement.model.Ticket;
import org.springframework.stereotype.Repository;

@Repository
public class TicketDao implements ITicketDao {
    @Override
    public void addTicket(Ticket ticket) {

    }

    @Override
    public Ticket getTicketById(Integer id) {
        return null;
    }
}
