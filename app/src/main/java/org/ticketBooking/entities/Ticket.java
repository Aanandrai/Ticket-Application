package org.ticketBooking.entities;

import java.util.Date;

public class Ticket {

    private String ticketId;

    private String userId;

    private String source;

    private String destination;

    private String dateOfTravel;

    private Train train;


    public Ticket(){}

    public Ticket(String ticketId, String userId, String source, String destination, String dateOfTravel, Train train){
        this.ticketId =ticketId;
        this.userId=userId;
        this.source=source;
        this.destination=destination;
        this.dateOfTravel=dateOfTravel;
        this.train=train;

    }

    public String getTicketInfo(){
        return String.format("Ticket ID: %s belongs to User %s from %s to %s on %s",ticketId , userId, source, destination, dateOfTravel);

    }

    public String getTicketId(){
        return ticketId;
    }

    public void setTicketId(String ticketId){
        this.ticketId=ticketId;
    }

    public String getUserId(){
        return userId;
    }

    public void setUserId(String userId){
        this.userId=userId;
    }

    public void setSource(String source){
        this.source=source;
    }

    public String getSource(){
        return source;
    }

    public void setDestination(String destination){
        this.destination=destination;
    }

    public String getDestination(){
        return destination;
    }



    public void setDateOfTravel(String dateOfTravel){
        this.dateOfTravel=dateOfTravel;
    }

    public String getDateOfTravel(){
        return destination;
    }

    public void setTrain(Train train){
        this.train=train;
    }

    public Train getTrain(){
        return train;
    }


}
