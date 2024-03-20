package com.spring.transactionmanagement.resource;

import com.spring.transactionmanagement.model.Application;
import com.spring.transactionmanagement.model.Release;
import com.spring.transactionmanagement.model.Ticket;
import com.spring.transactionmanagement.service.IApplicationService;
import com.spring.transactionmanagement.service.IReleaseService;
import com.spring.transactionmanagement.service.ITicketService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tza")
public class TrackzillaController {

    private final IApplicationService applicationService;
    private final ITicketService ticketService;

    private final IReleaseService releaseService;

    public TrackzillaController(IApplicationService applicationService, ITicketService ticketService, IReleaseService releaseService) {
        this.applicationService = applicationService;
        this.ticketService = ticketService;
        this.releaseService = releaseService;
    }

    @GetMapping("/tickets")
    public ResponseEntity<?> getAllTickets(){
        List<Ticket> tickets = ticketService.getAllTickets();
        return new ResponseEntity<>(tickets, HttpStatus.OK);
    }

    @GetMapping("/applications")
    public ResponseEntity<List<Application>> getAllApplication(){
        List<Application> applications = applicationService.getAllApplications();
        return new ResponseEntity<>(applications, HttpStatus.OK);
    }

    @PostMapping("/schedule")
    public ResponseEntity<Void> scheduleRelease(@RequestBody Release release){
        releaseService.scheduleRelease(release);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
