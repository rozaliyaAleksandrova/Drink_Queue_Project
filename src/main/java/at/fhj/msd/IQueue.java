package at.fhj.msd;

/**
 * Interface for a queue data structure that stores elements of type String.
 */
public interface IQueue {
    /**
     * Adds an element to the queue if possible.
     *
     * @param obj the element to add
     * @return true if the element was added successfully, false otherwise
     */
    public abstract boolean offer(String obj);

    /**
     * Retrieves and removes the first element of the queue.
     *
     * @return the first element, or null if the queue is empty
     */
    public abstract String poll();

    /**
     * Retrieves and removes the first element of the queue.
     *
     * @return the first element
     * @throws java.util.NoSuchElementException if the queue is empty
     */
    public abstract String remove();

    /**
     * Retrieves (but does not remove) the first element of the queue.
     *
     * @return the first element, or null if the queue is empty
     */
    public abstract String peek();

    /**
     * Retrieves (but does not remove) the first element of the queue.
     *
     * @return the first element
     * @throws java.util.NoSuchElementException if the queue is empty
     */
    public abstract String element();
}