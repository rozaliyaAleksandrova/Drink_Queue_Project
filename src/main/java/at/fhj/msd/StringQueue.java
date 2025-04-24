<<<<<<< HEAD
package at.fhj.msd;

=======
>>>>>>> 1d8dccbe3650dc4977bc3bc50544738cbe45ef3c
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

// there's some Bugs included, try to debug the code and fix the Bugs
// there are different Bugs, wrong implementation, typos, ...
// write Test-Cases (read Queue Interface for understanding methods) and use Debugging possibilies of your IDE

public class StringQueue implements IQueue {
  private List<String> elements = new ArrayList<String>();
  private int maxSize = 5;
<<<<<<< HEAD

  public StringQueue(int maxSize) {
   this.maxSize = maxSize;
=======
  /**
   * Constructor to create a StringQueue object.
   * @param maxsize
   */
  public StringQueue(int maxsize) {
    maxSize = maxSize;
>>>>>>> 1d8dccbe3650dc4977bc3bc50544738cbe45ef3c
  }
  /**
   * Constructor to create a StringQueue object with default size.
   */
  @Override
  public boolean offer(String obj) {
      if (elements.size() < maxSize) {
          return elements.add(obj);
      } else {
          return false;
      }
  }
  /**
   * Adds an element to the queue.
   * @param obj the String object to add
   * @return true if added successfully
   */
  @Override
  public String poll() {
      if (elements.isEmpty()) {
          return null;
      }
      return elements.remove(0);
  }
  /**
   * Retrieves and removes the head of the queue, or returns null if empty
   * @return the head of the queue or null if queue is empty
   */
  @Override
  public String remove() {
    String element = poll();
    if (element == null){
      throw new NoSuchElementException("There's no element any more.");
    }
    return element;
  }
  /**
   * Retrieves and removes the head of the queue
   * @return the head of the queue
   * @throws NoSuchElementException if queue is empty
   */
  @Override
  public String peek() {
    String element;
    if (elements.size() > 0)
      element = elements.get(0);
    else
      element = null;

    return element;
  }
  /**
   * Retrieves but does not remove the head of the queue, returns null if empty
   * @return the head of the queue or null if queue is empty
   */
  @Override
  public String element() {
    String element = peek();
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

}