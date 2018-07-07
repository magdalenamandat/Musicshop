package MusicShop.Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp() {
        guitar = new Guitar("wood", "black", "steel-stringed", 200, 300, 5 );
    }

    @Test
    public void getNumberOfStrings() {
        assertEquals(5, guitar.getNumberOfStrings());
    }

    @Test
    public void canPlay(){
        assertEquals("Yeah yeah", guitar.play("Yeah yeah"));
    }
}