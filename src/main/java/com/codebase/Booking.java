package com.codebase;

public class Booking {
    private Bedroom bedroom;
    private int numOfNightsBooked;


    public Booking(Bedroom bedroom, int numOfNightsBooked){
        this.bedroom = bedroom;
        this.numOfNightsBooked = numOfNightsBooked;
    }
    public double totalBill(){
        return numOfNightsBooked * bedroom.getRoomPrice();
    }
}
