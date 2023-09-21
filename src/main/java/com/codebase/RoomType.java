package com.codebase;

public enum RoomType {
    CONFERENCE("Conference",25),
    DINING("Dining Room", 50),
    SINGLE("Single", 1),
    DOUBLE("Double",2),
    TWIN("Twin",2),
    SUITE("Suite", 2);
    private final String roomType;
    private final int capacity;

    RoomType(String roomType, int capacity) {
        this.roomType = roomType;
        this.capacity = capacity;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getCapacity() {
        return capacity;
    }
}
