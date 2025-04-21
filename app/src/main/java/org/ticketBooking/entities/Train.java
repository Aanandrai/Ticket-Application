package org.ticketBooking.entities;

import java.sql.Time;
import java.util.List;
import java.util.Map;

public class Train {

    private String trainId;

    private String trainNo;

    private List<List<Integer>> seats;

    private Map<String, String>stationTimes;

    private List<String>stations;


    public Train(){}


    public Train(String trainId, String trainNo, List<List<Integer>> seats , Map<String,String> stationTimes, List<String> stations){
        this.trainId=trainId;
        this.trainNo=trainNo;
        this.seats=seats;
        this.stationTimes=stationTimes;
        this.stations=stations;
    }

    public void setTrainId(String trainId){
        this.trainId=trainId;
    }

    public void setTrainNo(String trainNo){
        this.trainNo=trainNo;
    }

    public  void setSeats(List<List<Integer>> seats){
        this.seats=seats;
    }


    public void setStationTimes(Map<String, String>stationTimes){
        this.stationTimes=stationTimes;
    }

    public void setStations(List<String> stations){
        this.stations=stations;
    }

    public String getTrainId(){
        return trainId;
    }

    public String setTrainNo(){
        return trainNo;
    }

    public  List<List<Integer>> setSeats(){
        return seats;
    }


    public Map<String, String> setStationTimes(){
        return stationTimes;
    }

    public List<String> setStations(){
        return stations;
    }
}
