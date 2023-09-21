package com.codebase;

public class ConferenceRoom extends Room{
    private String conferenceRoomName;

    public ConferenceRoom(RoomType typeOfRoom, int roomNumber, double roomPrice, String conferenceRoomName,double width,double length) {
        super(typeOfRoom, roomNumber, roomPrice,width,length);
        this.conferenceRoomName = conferenceRoomName;
    }

    public String getConferenceRoomName() {
        return conferenceRoomName;
    }
}
