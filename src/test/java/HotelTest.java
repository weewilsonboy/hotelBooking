import com.codebase.*;

import java.lang.Exception;
import java.util.ArrayList;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class HotelTest {
    Hotel hotel;
    Bedroom bedroom0;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    Bedroom bedroom4;
    @Before
    public void before() throws Exception {
        hotel=new Hotel();
        bedroom0 = new Bedroom(RoomType.DOUBLE, 0,1d,1d,1d);
        bedroom1 = new Bedroom(RoomType.SUITE, 0,1d,1d,1d);
        bedroom2 = new Bedroom(RoomType.SINGLE, 0,1d,1d,1d);
        bedroom3 = new Bedroom(RoomType.TWIN, 0,1d,1d,1d);
        bedroom4 = new Bedroom(RoomType.CONFERENCE, 0,1d,1d,1d);

    }
    @Test
    public void canAddBedroom() throws Exception {
        Bedroom bedroom = new Bedroom(RoomType.DOUBLE, 0,1d,1d,1d);
        hotel.addBedroom(bedroom);
        assertEquals(1,hotel.getNumberOfRooms());
    }
    @Test
    public void canCheckInGuests(){
        Guest guest1 = new Guest("Jim");
        Guest guest2 = new Guest("Test");
        Room room;
        room = (Room) bedroom0;
        hotel.checkInGuest(guest1, room);
        hotel.checkInGuest(guest2, room);
        assertEquals(2, bedroom0.getNumberOfRoomGuests());
    }
    @Test
    public void canMakeBooking(){

        assertEquals(5,hotel.makeBooking(5,bedroom0).totalBill(), 0.0);
    }
    @Test
    public void canAddDiningRoom(){
        DiningRoom banana;
        banana = new DiningRoom(RoomType.DINING, 0,2d,"Ron",1d,1d);
        hotel.addDiningRoom(banana);
        assertTrue(hotel.isInHashMap(banana));
    }
    @Test
    public void canSeeEmpty(){
        hotel.addBedroom(bedroom0);
        hotel.addBedroom(bedroom2);
        hotel.addBedroom(bedroom3);

        ArrayList<Bedroom> emptyStart =  hotel.getAllEmpty();
        Guest guest1 = new Guest("Jim");
        Guest guest2 = new Guest("Test");
        Guest[] guestsToAdd = new Guest[2];
        Room room;
        room = (Room) bedroom0;
        hotel.bookRoom(bedroom0,guestsToAdd);

        ArrayList<Bedroom> booked =  hotel.getAllEmpty();
        assertEquals(emptyStart,booked);
    }

}
