package com.spring.transactionmanagement.service;

import com.spring.transactionmanagement.model.Ticket;

import java.util.List;

public interface ITicketService {
    List<Ticket> getAllTickets();
}
