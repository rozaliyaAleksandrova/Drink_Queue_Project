package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 *  Implementation of a String Queue following the Queue interface
 */ 
public class StringQueue implements IQueue {
  private List<String> elements = new ArrayList<String>();
  private int maxSize = 5;
  /**
   * Constructor to initialize queue with a specific max size.
   * @param maxSize
   */
  public StringQueue(int maxSize) {
   this.maxSize = maxSize;
  }

/**
 * Inserts the specified element into this queue.
 * Prevent null elements from being added.
 * 
 * @param obj the element to add
 * @return {@code true} if the element was added to the queue, 
 *         {@code false} if the queue is full
 * @throws NullPointerException if the specified element is null
 * 
 */ 
  @Override 
  public boolean offer(String obj) {
    if (obj == null) {
      throw new NullPointerException("Null elements are not allowed");
    }
    if (elements.size() < maxSize) {
      return elements.add(obj);
    } else {
      return false; 
    }
  }

  /**
   * Retrieves and removes the head of the queue, or returns null if empty
   * 
   * @return the head of the queue or null if queue is empty
   */
  @Override
  public String poll() {  
    if (elements.isEmpty()) {
      return null;
    }
    return elements.remove(0);
  }

 /**
  * Removes and returns the head of the queue.
  * If the queue is empty, throws a {@link NoSuchElementException}.
  *
  * @return the element at the head of the queue
  * @throws NoSuchElementException if the queue is empty
  */
  @Override
  public String remove() {
    String element = poll();
    if (element == null){
      throw new NoSuchElementException("There's no element anymore.");
    }
    return element;
  }
  /**
   * Return the head element without removing it, or null if empty.
   * 
   * @return the head of the queue
   */
  @Override
  public String peek() {
    if (elements.size() > 0) {
      return elements.get(0);
        } else {
          return null;
       }
  }

  /**
   * Retrieves the head of the queue without removing it.
   * 
   * @return the head of the queue or null if queue is empty
   * @throws NoSuchElementException if queue is empty
   */
  @Override
  public String element() {
    String element = peek();
    if (element == null) {
      throw new NoSuchElementException("There's no element anymore");
    }
    return element;
  }
}