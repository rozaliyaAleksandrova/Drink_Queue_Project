package at.fhj.msd;

import java.util.NoSuchElementException;

/**
 * Interface representing a queue data structure that stores String elements.
 */
public interface IQueue {

  /**
     * Inserts the specified element into the queue if possible.
     * 
     * @param obj the element to add
     * @return true if the element was added successfully, false otherwise
     */
  public abstract boolean offer(String obj);

 /**
     * Retrieves and removes the head of the queue.
     * 
     * @return the head element, or null if the queue is empty
     */
  public abstract String poll();

  /**
     * Retrieves and removes the head of the queue.
     * 
     * @return the head element
     * @throws NoSuchElementException if the queue is empty
     */
  public abstract String remove();

  /**
     * Retrieves, but does not remove, the head of the queue.
     * 
     * @return the head element, or null if the queue is empty
     */ 
  public abstract String peek();


  /**
     * Retrieves, but does not remove, the head of the queue.
     * 
     * @return the head element
     * @throws NoSuchElementException if the queue is empty
     */
  public abstract String element();
}