package deqo.mpon.mysimplestack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * java doc
 */
public class MySimpleStackTest {
    private MySimpleStack stack;

    @Before
    public void setUp() {
        this.stack = new MySimpleStack();
    }

    @Test
    public void isEmpty() {
        assertTrue(this.stack.isEmpty());
    }

    @Test
    public void getSize() {
        this.stack.push(new Item(5));
        assertEquals(1, this.stack.getSize());
    }

    @Test
    public void push() {
        this.stack.push(new Item(6));
        assertEquals(6, this.stack.peek().getValeur());
    }

    @Test
    public void peek() {
        this.stack.push(new Item(7));
        assertEquals(7, this.stack.peek().getValeur());
    }

    @Test
    public void pop() {
        this.stack.push(new Item(9));
        assertEquals(9, this.stack.pop().getValeur());
        assertEquals(0, this.stack.getSize());
    }
}