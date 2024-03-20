package com.spring.transactionmanagement.service;

import com.spring.transactionmanagement.dao.ReleaseDao;
import com.spring.transactionmanagement.dao.TicketDao;
import com.spring.transactionmanagement.model.Release;
import org.springframework.stereotype.Service;

@Service
public class ReleaseService implements IReleaseService{
    private final ReleaseDao releaseDao;
    private final TicketDao ticketDao;

    public ReleaseService(ReleaseDao releaseDao, TicketDao ticketDao) {
        this.releaseDao = releaseDao;
        this.ticketDao = ticketDao;
    }

    @Override
    public Release getRelease(int releaseId){
        return releaseDao.getReleaseId(releaseId);
    }

    @Override
    public void addRelease(Release release){
        releaseDao.addRelease(release);
    }


    @Override
    public Release scheduleRelease(Release release){
        /*
        * Transaction consist of two steps:
        * 1. Assign a ticket to an existing release as one database tranx via releaseDao
        * 2. Update the status on existing tickets to deployed status as another tranx via */

        // STEP 1a - create the new tickets
        release.getTickets().forEach(ticket->ticketDao.addTicket(ticket));
        //STEP 1b- Associate the tickets to a release
        Release releaseToUpdate = getRelease(release.getId());
        releaseToUpdate.setTickets(release.getTickets());

        //STEP 2 - Update the tickets to completed  only after associating them to release
        release.getTickets().forEach(ticket->{
            ticketDao.getTicketById(ticket.getId()).setStatus("COMPLETED");
        });
        return release;
    }

}
