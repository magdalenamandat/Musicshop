package MusicShop.Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DrumsTest {

    Drums drums;

    @Before
    public void setUp(){
        drums = new Drums("wood", "red", "percussion", 300, 400, 2);
    }

    @Test
    public void getSetSize() {
        assertEquals(2, drums.getSetSize());
    }

    @Test
    public void getType() {
        assertEquals("percussion", drums.getType());
    }

    @Test
    public void getColour() {
        assertEquals("red", drums.getColour());
    }

    @Test
    public void getMaterial() {
        assertEquals("wood", drums.getMaterial());
    }

    @Test
    public void getPrice() {
        assertEquals(300, drums.getPrice());
    }

    @Test
    public void getSellPrice() {
        assertEquals(400, drums.getSellPrice());
    }
}