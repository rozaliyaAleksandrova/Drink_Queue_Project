package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;
import static org.junit.jupiter.api.Assertions.*;

class StringQueueTest {
    private StringQueue queue;

    @BeforeEach
    void setUp() {
        queue = new StringQueue(5);
    }

    @Test
    void testOfferAndPoll() {
        // Test that offering an element to the queue succeeds and that polling retrieves the same element
        // Verify that offer returns true when adding to a non-full queue
        assertTrue(queue.offer("Test")); 
        // Verify that poll retrieves the element that was just added
        assertEquals("Test", queue.poll()); 
    }

    @Test
    void testQueueFull() {
        // Fill the queue to its maximum capacity
        for (int i = 0; i < 5; i++) {
            queue.offer("Item " + i);
        }
        // Test that offering another element fails when the queue is full
        assertFalse(queue.offer("Too much")); // Should return false as the queue is at capacity
    }

    @Test
    void testElementOperations() {
        // Add an element and verify peek() and element() return the same, current front of the queue
        queue.offer("First");
        // peek() should return the front element without removing it
        assertEquals("First", queue.peek());
        // element() should also return the front element without removing it
        assertEquals("First", queue.element());
    }

    @Test
    void testEmptyQueueBehavior() {
        // When the queue is empty, poll() should return null
        assertNull(queue.poll());
        // When the queue is empty, element() should throw NoSuchElementException
        assertThrows(NoSuchElementException.class, () -> queue.element());
    }
}