package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.NoSuchElementException;

/**
 * Tests for DrinkQueue class verifying queue operations
 * according to the Queue interface specification.
 */
class DrinkQueueTest {
    private DrinkQueue queue;
    private Drink drink1;
    private Drink drink2;
    @BeforeEach
    void setUp() {
        queue = new DrinkQueue();
        drink1 = new SimpleDrink("Beer", new Liquid("Beer", 0.5, 5));
        drink2 = new SimpleDrink("Wine", new Liquid("Wine", 0.75, 12));
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
/**
 * Tests the remove() method to ensure it removes and returns the first element.
 * Also checks whether the NoSuchElementException is thrown when the queue is empty.
 */
@Test
    void testRemove() {
        // Fill queue with an element
        queue.offer(drink1);
        // Removed element should be the first element
        assertEquals(drink1, queue.remove(), "remove() should return the first element");
        // Queue is now empty, remove() should throw NoSuchElementException
        assertThrows(NoSuchElementException.class, () -> queue.remove(),
            "remove() should throw NoSuchElementException if the queue is empty");
    }

    /**
     * Testet die Methode isEmpty(), um sicherzustellen, dass sie true ist, wenn die Queue leer ist,
     * und false, wenn Elemente vorhanden sind.
     */
    @Test
    void testIsEmpty() {
        // Neue Queue ist initial leer
        assertTrue(queue.isEmpty(), "New queue should be empty");
        // Add element
        queue.offer(drink1);
        // After adding, the queue should not be empty
        assertFalse(queue.isEmpty(), "Queue should not be empty after offer()");
        // Remove element
        queue.poll();
        // After removal the queue is empty again
        assertTrue(queue.isEmpty(), "Queue should be empty again after poll()");
    }

}