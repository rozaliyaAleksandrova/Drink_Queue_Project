import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

// there's some Bugs included, try to debug the code and fix the Bugs
// there are different Bugs, wrong implementation, typos, ...
// write Test-Cases (read Queue Interface for understanding methods) and use Debugging possibilies of your IDE

public class StringQueue implements IQueue {
  private List<String> elements = new ArrayList<String>();
  private int maxSize = 5;
  /**
   * Constructor to create a StringQueue object.
   * @param maxSize
   */
  public StringQueue(int maxsize) {
    this.maxSize = maxSize;
  }
  /**
   * Constructor to create a StringQueue object with default size.
   */
  @Override
  public boolean offer(String obj) {
    if (elements.size() != maxSize)
      elements.add(obj);
    else
      return false;

    return true;
  }
  /**
   * Adds an element to the queue.
   * @param obj the String object to add
   * @return true if added successfully
   */
  @Override
  public String poll() {
    String element = peek();

    if (elements.size() == 0) {
      elements.remove(0);
    }

    return element;
  }
  /**
   * Retrieves and removes the head of the queue, or returns null if empty
   * @return the head of the queue or null if queue is empty
   */
  @Override
  public String remove() {
    String element = poll();
    element = "";
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

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