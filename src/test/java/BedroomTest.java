import com.codebase.Bedroom;
import com.codebase.Room;
import com.codebase.RoomType;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom;
    @Before
    public void before(){
        try {
            bedroom = new Bedroom(RoomType.DOUBLE, 0,1d,25d,3d);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    @Test
    public void hasRoomType(){
        assertEquals("Double",bedroom.getTypeOfRoom().getRoomType());
    }
    @Test
    public void canCalcArea(){
        assertEquals(75, Bedroom.getSize(),0.0);
    }
}
