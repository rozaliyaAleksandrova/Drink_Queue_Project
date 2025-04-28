package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

class DrinkQueueTest {
    private DrinkQueue queue;
    private Drink drink1;

    @BeforeEach
    void setUp() {
        queue = new DrinkQueue();
        drink1 = new SimpleDrink("Beer", new Liquid("Beer", 0.5, 5));
    }

    @Test
    void testOfferAndPoll() {
        assertTrue(queue.offer(drink1));
        assertEquals(drink1, queue.poll());
    }
  
    @Test
    void testEmptyQueue() {
        assertNull(queue.poll());
        assertThrows(NoSuchElementException.class, () -> queue.remove());
    }

    @Test
    void testPeekVsElement() {
        queue.offer(drink1);
        assertEquals(drink1, queue.peek());
        assertEquals(drink1, queue.element());
        assertNotNull(queue.peek());
    }

    @Test
    void testQueueSize() {
        assertEquals(0, queue.size());
        queue.offer(drink1);
        assertEquals(1, queue.size());
    }
}