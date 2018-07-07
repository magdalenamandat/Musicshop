package MusicShop.Accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuitarCoverTest {

    GuitarCover guitarCover;

    @Before
    public void setUp() {
        guitarCover = new GuitarCover(100, 150);
    }


    @Test
    public void getAccessorySellPrice() {
        assertEquals(150, guitarCover.getSellPrice());
    }

    @Test
    public void getAccessoryPrice() {
        assertEquals(100, guitarCover.getPrice());
    }

}