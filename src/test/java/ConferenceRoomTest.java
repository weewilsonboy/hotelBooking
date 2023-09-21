import com.codebase.ConferenceRoom;
import com.codebase.Room;
import com.codebase.RoomType;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
public class ConferenceRoomTest {
    ConferenceRoom confRoom;
    @Before
    public void before(){
        confRoom = new ConferenceRoom(RoomType.CONFERENCE, 0, 600d,"Mike Ritchie Room",1d,1d);
    }
    @Test
    public void isAConferenceRoom(){
        assertEquals("Conference", confRoom.getTypeOfRoom().getRoomType());
        assertEquals(0, confRoom.getRoomNumber());
        assertEquals(600d,confRoom.getRoomPrice(),0.0);
        assertEquals("Mike Ritchie Room", confRoom.getConferenceRoomName());
    }
}
