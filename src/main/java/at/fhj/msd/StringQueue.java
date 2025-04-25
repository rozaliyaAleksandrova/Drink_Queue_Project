package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

// there's some Bugs included, try to debug the code and fix the Bugs
// there are different Bugs, wrong implementation, typos, ...
// write Test-Cases (read Queue Interface for understanding methods) and use Debugging possibilies of your IDE

// Implementation of a String Queue following the Queue interface
public class StringQueue implements IQueue {

  private List<String> elements = new ArrayList<String>();
  private int maxSize = 5;

//Constructor to initialize queue with a specific max size
  public StringQueue(int maxSize) {
   this.maxSize = maxSize;
  }

// Prevent null elements from being added
  @Override
  public boolean offer(String obj) {
    if (obj == null) {
      throw new NullPointerException("Null elements are not allowed");
    }

// Check if there's space to add new element
    if (elements.size() < maxSize) {
      return elements.add(obj);
    } else {
  // Queue is full
      return false; 
    }
  }

// Remove and return the head of the queue, or null if empty
  @Override
  public String poll() {  
    if (elements.isEmpty()) {
      return null;
    }
    return elements.remove(0);
  }

// Remove and return the head; throw exception if empty
  @Override
  public String remove() {
    String element = poll();
    if (element == null){
      throw new NoSuchElementException("There's no element anymore.");
    }
    return element;
  }

// Return the head element without removing it, or null if empty
@Override
public String peek() {
  if (elements.size() > 0) {
    return elements.get(0);
  } else {
    return null;
  }
}

// Return the head element without removing it; throw exception if empty
  @Override
  public String element() {
    String element = peek();
    if (element == null) {
      throw new NoSuchElementException("There's no element anymore");
    }
    return element;
  }
}