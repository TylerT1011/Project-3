package datastructures;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

/**
 * ITSC 2214 Melody.
 * Instructor-provided code.
 */
public class LinkedStackTest {
    LinkedStack<Integer> stack;

    /**
     * Initialize the LinkedStack instance.
     */
    @Before
    public void setup() {
        stack = new LinkedStack<Integer>();
    }

    /**
     * Test of isEmpty method, of class LinkedStack.
     */
    @Test
    public void testIsEmpty() {
        assertTrue(stack.isEmpty());
        stack.push(6);
        assertFalse(stack.isEmpty());
        assertEquals(6, stack.topValue().intValue());
    }

    /**
     * Test of peek method, of class LinkedStack.
     */
    @Test
    public void testTopValue1() throws Exception {
        assertNull(stack.topValue());
    }

    /**
     * Test of peek method, of class LinkedStack.
     */
    @Test
    public void testTopValue2() {
        stack.push(1);
        assertEquals(1, (int)stack.topValue());
    }
    
    /**
     * Test of pop method, of class LinkedStack.
     */
    @Test
    public void testPop1() {
        assertNull(stack.pop());
    }

    /**
     * Test of pop method, of class LinkedStack.
     */
    @Test
    public void testPop2() {
        stack.push(1);
        int popped = stack.pop();
        assertEquals(1, popped);
    }
    
    /**
     * Test of push method, of class LinkedStack.
     */
    @Test
    public void testPush() {
        //TODO test your push method of LinkedQueue<Integer>
        stack.push(4);
        assertEquals(1, stack.size());
        assertEquals(4, stack.topValue().intValue());
        stack.push(6);
        assertEquals(2, stack.size());
        assertEquals(6, stack.topValue().intValue());
        stack.pop();
        assertEquals(4, stack.topValue().intValue());
    }

    /**
     * Test of size method, of class LinkedStack.
     */
    @Test
    public void testSize() {
        stack.push(4);
        assertEquals(1, stack.size());
        stack.pop();
        assertEquals(0, stack.size());
    }
    
    /**
     * Test of clear() method of class LinkedStack.
     */
    @Test
    public void testClear() {
        stack.push(4);
        stack.push(6);
        stack.clear();
        assertEquals(0, stack.size());
        assertNull(stack.topValue());
    }
}
