package com.codebase;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Hotel {
    private ArrayList<Bedroom> bedroomArrayList;
    private ArrayList<ConferenceRoom> conferenceRoomArrayList;
    private ArrayList<Bedroom> bookedBedroomsArrayList;
    private ArrayList<Booking> bookingArrayList;
    private HashMap<String, DiningRoom> diningRoomHashMap;
    public Hotel(){
        this.bedroomArrayList = new ArrayList<>();
        this.conferenceRoomArrayList = new ArrayList<>();
        this.bookedBedroomsArrayList = new ArrayList<>();
        this.bookingArrayList = new ArrayList<>();
        this.diningRoomHashMap = new HashMap<>();
    }

    public void addBedroom(Bedroom bedroom){
        bedroomArrayList.add(bedroom);
    }
    public int getNumberOfRooms(){
        return bedroomArrayList.size();
    }
    public void removeBedroom(Bedroom bedroom){
        bedroomArrayList.remove(bedroom);
    }

    public void addToBookedRooms(Bedroom bedroom){
        bookedBedroomsArrayList.add(bedroom);
    }

    public void removeFromBookedRooms(Bedroom bedroom){
        bookedBedroomsArrayList.remove(bedroom);
    }



    public void bookRoom(Bedroom bedroom, Guest[] guests){
        removeBedroom(bedroom);
        for (Guest guest:guests){
            checkInGuest(guest, bedroom);
        }
        addToBookedRooms(bedroom);
    }

    public void checkOutRoom(Bedroom bedroom){
        removeFromBookedRooms(bedroom);
        addBedroom(bedroom);
        bedroom.clearRoom();
    }

    public void checkInGuest(Guest guest, Room room){
        room.addGuestToRoom(guest);
    }

    public Booking makeBooking(int numOfNights, Bedroom bedroom){
        Booking booking;
        booking = new Booking(bedroom, numOfNights);
        addBookingToArray(booking);
        return booking;
    }
    private void addBookingToArray(Booking booking){
        bookingArrayList.add(booking);
    }
    public void addDiningRoom(DiningRoom diningRoom){
        diningRoomHashMap.put(diningRoom.getName(), diningRoom);
    }
    public boolean isInHashMap(DiningRoom test){
        if(diningRoomHashMap.containsValue(test)){
            return true;
        }
        return false;
    }
    public ArrayList<Bedroom> getAllEmpty(){
        return bedroomArrayList;
    }
    public ArrayList<Bedroom> getBookedBedroomsArrayList(){
        return bookedBedroomsArrayList;
    }

}
