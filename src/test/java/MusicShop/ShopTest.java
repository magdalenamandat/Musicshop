package MusicShop;

import MusicShop.Accessories.DrumStick;
import MusicShop.Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ShopTest {

    Shop shop;
    Piano piano;
    DrumStick drumStick;

    @Before
    public void setUp(){
        shop = new Shop("Music World");
        piano = new Piano("wood", "white", "stringed", 900, 1500, 1948, "Plink plonk");
        drumStick = new DrumStick(40, 60);
    }

    @Test
    public void getName() {
        assertEquals("Music World", shop.getName());
    }

    @Test
    public void hasEmptyStock() {
        ArrayList emptyStock = shop.getStock();
        assertEquals(0, emptyStock.size());
    }

    @Test
    public void canAddInstrumentToStock() {
        shop.addToStock(piano);
        ArrayList emptyStock = shop.getStock();
        assertEquals(1, emptyStock.size());
    }

    @Test
    public void canAddAccessoryToStock() {
        shop.addToStock(drumStick);
        ArrayList emptyStock = shop.getStock();
        assertEquals(1, emptyStock.size());
    }

    @Test
    public void canRemoveISellsFromStock() {
        shop.addToStock(piano);
        shop.addToStock(drumStick);
        shop.removeFromStock(piano);
        ArrayList emptyStock = shop.getStock();
        assertEquals(1, emptyStock.size());
    }
}