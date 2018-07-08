package MusicShop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

    Shop shop;

    @Before
    public void setUp(){
        shop = new Shop("Music World");
    }

    @Test
    public void getName() {
        assertEquals("Music World", shop.getName());
    }

    @Test
    public void getStock() {
    }
}