package com.spring.transactionmanagement.dao;

import com.spring.transactionmanagement.model.Ticket;

public interface ITicketDao {
    void addTicket(Ticket ticket);

    Ticket getTicketById(Integer id);
}
