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
    public void getAccessorySellPrice() {
        assertEquals(40, drumStick.sellPrice());
    }

    @Test
    public void getAccessoryPrice() {
        assertEquals(30, drumStick.getPrice());
    }
}