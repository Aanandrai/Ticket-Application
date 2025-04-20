package org.ticketBooking.entities;

import org.checkerframework.checker.index.qual.EnsuresLTLengthOf;

public class User {

    private String name;

    private String password;

    private String hashPassword;

    private EnsuresLTLengthOf.List<Ticket> ticketsBooked;

    private String userId;


}
