package MusicShop.Accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuitarStringTest {

    GuitarString guitarString;

    @Before
    public void setUp(){
        guitarString = new GuitarString(50, 80);
    }

    @Test
    public void getAccessoryPrice() {
        assertEquals(50, guitarString.getPrice());
    }

    @Test
    public void getAccessorySellPrice() {
        assertEquals(80, guitarString.getSellPrice());
    }
}