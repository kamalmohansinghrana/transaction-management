package com.spring.transactionmanagement.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.spring.transactionmanagement.model.Ticket;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Release {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String description;
    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Ticket> tickets;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate releaseDate;

    public Release() {
    }

    public Release(String name, String description, List<Ticket> tickets, LocalDate releaseDate) {
        this.name = name;
        this.description = description;
        this.tickets = tickets;
        this.releaseDate = releaseDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }
}
