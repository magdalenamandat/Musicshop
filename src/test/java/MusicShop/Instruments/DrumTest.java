package MusicShop.Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DrumTest {

    Drum drum;

    @Before
    public void setUp(){
        drum = new Drum("wood", "red", "percussion", 300, 400, 2);
    }

    @Test
    public void getSetSize() {
        assertEquals(2, drum.getSetSize());
    }

    @Test
    public void getType() {
        assertEquals("percussion", drum.getType());
    }

    @Test
    public void getColour() {
        assertEquals("red", drum.getColour());
    }

    @Test
    public void getMaterial() {
        assertEquals("wood", drum.getMaterial());
    }

    @Test
    public void getPrice() {
        assertEquals(300, drum.getPrice());
    }

    @Test
    public void getSellPrice() {
        assertEquals(400, drum.getSellPrice());
    }
}