package com.codebase;

public class DiningRoom extends Room{
    private String name;
    public DiningRoom(RoomType typeOfRoom, int roomNumber, double roomPrice, String name, double width, double length) {
        super(typeOfRoom, roomNumber, roomPrice, width, length);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
