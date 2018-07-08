package MusicShop.Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PianoTest {

    Piano piano;

    @Before
    public void setUp(){
        piano = new Piano("oak", "white", "stringed", 800, 1000, 1935,"Plink plonk");
    }

    @Test
    public void getProductionYear() {
        assertEquals(1935, piano.getProductionYear());
    }

    @Test
    public void canPlay(){
        assertEquals("Plink plonk", piano.play("Plink plonk"));
    }
}