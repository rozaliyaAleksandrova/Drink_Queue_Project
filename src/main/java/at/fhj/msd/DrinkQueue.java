package at.fhj.msd;

import java.util.LinkedList;
import java.util.Queue;
import java.util.NoSuchElementException;

/**
 * Class to manage drinks implementing Drink interface in a queue.
 */
public class DrinkQueue {

    private Queue<Drink> drinks;

    /**
     * Initializes the DrinkQueue.
     */
    public DrinkQueue() {
        drinks = new LinkedList<>();
    }

    /**
     * Adds a drink to the queue.
     *
     * @param drink the Drink object to add
     * @return true if added successfully
     */
    public boolean offer(Drink drink) {
        return drinks.offer(drink);
    }

    /**
     * Retrieves and removes the head of the queue, or returns null if empty.
     *
     * @return the head of the queue or null if queue is empty
     */
    public Drink poll() {
        return drinks.poll();
    }

    /**
     * Retrieves and removes the head of the queue.
     *
     * @return the head of the queue
     * @throws NoSuchElementException if queue is empty
     */
    public Drink remove() {
        return drinks.remove();
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