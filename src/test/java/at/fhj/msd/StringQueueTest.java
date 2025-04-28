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
        assertTrue(queue.offer("Test"));
        assertEquals("Test", queue.poll());
    }

    @Test
    void testQueueFull() {
        for (int i = 0; i < 5; i++) {
            queue.offer("Item " + i);
        }
        assertFalse(queue.offer("Too much"));
    }

    @Test
    void testElementOperations() {
        queue.offer("First");
        assertEquals("First", queue.peek());
        assertEquals("First", queue.element());
    }

    @Test
    void testEmptyQueueBehavior() {
        assertNull(queue.poll());
        assertThrows(NoSuchElementException.class, () -> queue.element());
    }
}