package deqo.mpon.mysimplestack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {
    private Item item;

    @Before
    public void setUp() {
        this.item = new Item();
    }

    @Test
    public void testGetValeur() {
        assertEquals(0, this.item.getValeur());
    }

    @Test
    public void testSetValeur() {
        this.item.setValeur(54);
        assertEquals(54, this.item.getValeur());
    }

    @Test
    public void testToString() {
        assertEquals("0", this.item.toString());
    }

    @Test
    public void testInitItem() {
        this.item = new Item(5);
        assertEquals(5, item.getValeur());
    }
}