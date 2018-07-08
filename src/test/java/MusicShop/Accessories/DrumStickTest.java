package MusicShop.Accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DrumStickTest {

    DrumStick drumStick;

    @Before
    public void setUp() {
      drumStick = new DrumStick(30, 40);
    }


    @Test
    public void getSellPrice() {
        assertEquals(40, drumStick.getSellPrice());
    }

    @Test
    public void getPrice() {
        assertEquals(30, drumStick.getPrice());
    }


    @Test
    public void canCalculateMarkup(){
        assertEquals(10, drumStick.calculateMarkup(30, 40));
    }
}