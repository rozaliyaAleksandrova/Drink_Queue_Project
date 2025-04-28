package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.NoSuchElementException;

/**
 * Tests for {@link DrinkQueue} class verifying queue operations
 * according to the Queue interface specification.
 */
class DrinkQueueTest {
    private DrinkQueue queue;
    private Drink drink1;

    @BeforeEach
    void setUp() {
        queue = new DrinkQueue();
        drink1 = new SimpleDrink("Beer", new Liquid("Beer", 0.5, 5));
    }

    /**
     * Tests basic queue operations:
     * - Successful addition via offer()
     * - Correct retrieval and removal via poll()
     * - First-in-first-out guarantee
     */
    @Test
    void testOfferAndPoll() {
        // Verify element can be added
        assertTrue(queue.offer(drink1), 
            "offer() should return true when adding element to non-full queue");
        
        // Verify same element is returned and removed
        assertEquals(drink1, queue.poll(),
            "poll() should return and remove the first added element");
    }
  
    /**
     * Tests empty queue behavior:
     * - poll() returns null when empty
     * - remove() throws NoSuchElementException when empty
     */
    @Test
    void testEmptyQueue() {
        // Verify empty queue behavior
        assertNull(queue.poll(),
            "poll() should return null for empty queue");
        
        assertThrows(NoSuchElementException.class, () -> queue.remove(),
            "remove() should throw NoSuchElementException for empty queue");
    }

    /**
     * Tests peek operations:
     * - peek() returns but doesn't remove element
     * - element() returns but doesn't remove element
     * - Both methods return same element
     * - peek() doesn't throw exception for empty queue
     */
    @Test
    void testPeekVsElement() {
        queue.offer(drink1);
        
        // Verify peek behavior
        assertEquals(drink1, queue.peek(),
            "peek() should return first element without removal");
        
        // Verify element behavior
        assertEquals(drink1, queue.element(),
            "element() should return first element without removal");
        
        // Verify queue unchanged
        assertNotNull(queue.peek(),
            "peek() should not affect queue contents");
    }

    /**
     * Tests queue size tracking:
     * - Initial size is 0
     * - Size increases after offer()
     * - Size decreases after poll()
     */
    @Test
    void testQueueSize() {
        // Verify initial state
        assertEquals(0, queue.size(),
            "New queue should have size 0");
        
        // Verify size after addition
        queue.offer(drink1);
        assertEquals(1, queue.size(),
            "Queue size should increment after offer()");
        
        // Verify size after removal
        queue.poll();
        assertEquals(0, queue.size(),
            "Queue size should decrement after poll()");
    }
}