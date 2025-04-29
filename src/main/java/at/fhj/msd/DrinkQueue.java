package at.fhj.msd;

import java.util.LinkedList;
import java.util.Queue;
import java.util.NoSuchElementException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Class to manage drinks implementing Drink interface in a queue.
 */
public class DrinkQueue {
    private static final Logger logger = LogManager.getLogger(DrinkQueue.class);
    private Queue<Drink> drinks;

    /**
     * Initializes the DrinkQueue.
     */
    public DrinkQueue() {
        logger.debug("Initializing new DrinkQueue");
        drinks = new LinkedList<>();
    }

    /**
     * Adds a drink to the queue.
     *
     * @param drink the Drink object to add
     * @return true if added successfully
     */
    public boolean offer(Drink drink) {
        logger.debug("Offering drink to queue: {}", drink.getName());
        return drinks.offer(drink);
    }

    /**
     * Retrieves and removes the head of the queue, or returns null if empty.
     *
     * @return the head of the queue or null if queue is empty
     */
     public Drink poll() {
        Drink drink = drinks.poll();
        if (drink != null) {
            logger.debug("Polled drink from queue: {}", drink.getName());
        } else {
            logger.warn("Attempt to poll from empty queue");
        }
        return drink;
    }

    /**
     * Retrieves and removes the head of the queue.
     *
     * @return the head of the queue
     * @throws NoSuchElementException if queue is empty
     */
    public Drink remove() {
        try {
            Drink drink = drinks.remove();
            logger.debug("Removed drink from queue: {}", drink.getName());
            return drink;
        } catch (NoSuchElementException e) {
            logger.error("Attempt to remove from empty queue", e);
            throw e;
        }
    }

    /**
     * Retrieves but does not remove the head of the queue, returns null if empty.
     *
     * @return the head of the queue or null if queue is empty
     */
    public Drink peek() {
        return drinks.peek();
    }

    /**
     * Retrieves but does not remove the head of the queue.
     *
     * @return the head of the queue
     * @throws NoSuchElementException if queue is empty
     */
    public Drink element() {
        return drinks.element();
    }

    /**
     * Checks if the queue is empty.
     *
     * @return true if queue is empty, false otherwise
     */
    public boolean isEmpty() {
        return drinks.isEmpty();
    }

    /**
     * Returns the number of drinks in the queue.
     *
     * @return size of queue
     */
    public int size() {
        return drinks.size();
    }
}