package com.codebase;

public abstract class Room {
    private final RoomType typeOfRoom;
    private final int roomNumber;
    private final double roomPrice;
    private Guest[] roomGuests;
    private static double width;
    private static double length;

    public Room(RoomType typeOfRoom, int roomNumber, double roomPrice, double width, double length) {
        this.typeOfRoom = typeOfRoom;
        this.roomNumber = roomNumber;
        this.roomPrice = roomPrice;
        this.roomGuests = new Guest[typeOfRoom.getCapacity()];
        this.width = width;
        this.length = length;
    }

    public RoomType getTypeOfRoom() {
        return typeOfRoom;
    }

    public void addGuestToRoom(Guest guest){
        for (int i = 0; i < roomGuests.length; i++) {
            if (roomGuests[i] == null) {
                roomGuests[i] = guest;
                break;
            }
        }
    }
    public void clearRoom(){
        for (int i =0;i<roomGuests.length;i++){
            roomGuests[i] = null;
        }
    }
    public int getNumberOfRoomGuests(){
        int counter=0;
        for (Guest person:roomGuests) {
            if (person !=null){
                counter+=1;
            }
        }
        return counter;
    }
    public int getRoomNumber() {
        return roomNumber;
    }

    public double getRoomPrice() {
        return roomPrice;
    }



    public static double getSize(){
        return width * length;
    }
}
