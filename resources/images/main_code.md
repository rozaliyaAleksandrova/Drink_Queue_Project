## Drink_Queue_Project code:

`1. class Drink:`
```
package at.fhj.msd;

/**
 * Represents a drink with volume, alcohol percentage and name.
 */
public interface Drink {

    /**
     * Returns the volume of the drink in liters.
     * @return volume in liters
     */
    double getVolume();

    /**
     * Returns the alcohol percentage of the drink.
     * @return alcohol percentage (e.g., 5.5 for 5.5%)
     */
    double getAlcoholPercent();

     /**
     * Checks if the drink contains alcohol.
     * @return true if alcohol > 0, false otherwise
     */
    boolean isAlcoholic();

    /**
     * Returns the name of the drink.
     * @return drink name
     */
    String getName();

    /**
     * Sets the name of the drink.
     * @param name new name of the drink
     */
    void setName(String name);
}
```

`2. class Liquid: `
```
package at.fhj.msd;

/**
 * Represents a liquid used in drinks, with name, volume and alcohol percentage.
 */
public class Liquid {
    private String name;
    private double volume;
    private double alcoholPercent;

    /**
     * Constructor to create a Liquid object.
     * @param name name of the liquid
     * @param volume volume in litres
     * @param alcoholPercent alcohol percentage
     */
    public Liquid(String name, double volume, double alcoholPercent) {
        this.name = name;
        this.volume = volume;
        this.alcoholPercent = alcoholPercent;
    }

    /**
     * Gets the name of the liquid.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the liquid.
     * @param name new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the volume.
     * @return volume in litres
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Sets the volume.
     * @param volume new volume
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }

    /**
     * Gets alcohol percentage.
     * @return alcohol percentage
     */
    public double getAlcoholPercent() {
        return alcoholPercent;
    }

    /**
     * Sets alcohol percentage.
     * @param alcoholPercent new alcohol percentage
     */
    public void setAlcoholPercent(double alcoholPercent) {
        this.alcoholPercent = alcoholPercent;
    }
}
```

`3. class SimpleDrink:`
```
package at.fhj.msd;

/**
 * Class represents a simple drink liquid which can be used in drinks.
 */
public class SimpleDrink implements Drink {

    /**
     * The only liquid contained in the drink.
     */
    protected Liquid l;

    /**
     * Name of the drink.
     */
    protected String name;

    /**
     * Creates a SimpleDrink object with given name and liquid.
     *
     * @param name name of drink
     * @param l only liquid in drink
     */
    public SimpleDrink(String name, Liquid l) {
        this.name = name;
        this.l = l;
    }

    /**
     * Returns volume of the liquid.
     *
     * @return the volume of drink in litre
     */
    @Override
    public double getVolume() {
        return l.getVolume();
    }

    /**
     * Returns alcohol volume percent of the liquid.
     *
     * @return alcohol volume percent
     */
    @Override
    public double getAlcoholPercent() {
        return l.getAlcoholPercent();
    }

    /**
     * Gives information if drink is alcoholic or not.
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    @Override
    public boolean isAlcoholic() {
        return l.getAlcoholPercent() > 0;
    }

    /**
     * Returns name of drink.
     *
     * @return name of drink
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the drink.
     *
     * @param name name to set
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the liquid used in the drink.
     *
     * @return liquid
     */
    public Liquid getLiquid() {
        return l;
    }

    /**
     * Sets the liquid used in the drink.
     *
     * @param l liquid to set
     */
    public void setLiquid(Liquid l) {
        this.l = l;
    }
}
```

`4. class StringQueue:`
```
package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Implementation of a simple String Queue using a List.
 */
public class StringQueue implements IQueue {
    private List<String> elements = new ArrayList<>();
    private int maxSize;

    /**
     * Constructor to create a StringQueue object with a specified maximum size.
     * @param maxSize the maximum number of elements the queue can hold
     */
    public StringQueue(int maxSize) {
        this.maxSize = maxSize;
    }

    /**
     * Adds an element to the tail of the queue.
     * @param obj the String object to add
     * @return true if the element was added successfully, false if the queue is full
     */
    @Override
    public boolean offer(String obj) {
        if (elements.size() < maxSize) {
            elements.add(obj);
            return true;
        }
        return false; // Queue ist voll
    }

    /**
     * Retrieves and removes the head of the queue, or returns null if the queue is empty.
     * @return the head of the queue or null if the queue is empty
     */
    @Override
    public String poll() {
        if (elements.isEmpty()) {
            return null;
        }
        return elements.remove(0);
    }

    /**
     * Retrieves and removes the head of the queue.
     * @return the head of the queue
     * @throws NoSuchElementException if the queue is empty
     */
    @Override
    public String remove() {
        String element = poll();
        if (element == null) {
            throw new NoSuchElementException("The queue is empty");
        }
        return element;
    }

    /**
     * Retrieves, but does not remove, the head of the queue, or returns null if the queue is empty.
     * @return the head of the queue or null if the queue is empty
     */
    @Override
    public String peek() {
        if (elements.isEmpty()) {
            return null;
        }
        return elements.get(0);
    }

    /**
     * Retrieves, but does not remove, the head of the queue.
     * @return the head of the queue
     * @throws NoSuchElementException if the queue is empty
     */
    @Override
    public String element() {
        String element = peek();
        if (element == null) {
            throw new NoSuchElementException("The queue is empty");
        }
        return element;
    }
}
```


`5. public interface IQueue:`
```
package at.fhj.msd;

import java.util.NoSuchElementException;

/**
 * Interface for a Queue data structure.
 */
public interface IQueue {

    /**
     * Adds an object to the end of the queue.
     *
     * @param obj The object to be added.
     * @return {@code true} if the object was successfully added, otherwise {@code false}.
     */
    boolean offer(String obj);

    /**
     * Removes and returns the first element of the queue.
     * If the queue is empty, returns {@code null}.
     *
     * @return The first element of the queue or {@code null} if the queue is empty.
     */
    String poll();

    /**
     * Removes and returns the first element of the queue.
     * If the queue is empty, throws a {@link java.util.NoSuchElementException}.
     *
     * @return The first element of the queue.
     * @throws java.util.NoSuchElementException if the queue is empty.
     */
    String remove();

    /**
     * Retrieves, but does not remove, the first element of the queue.
     * If the queue is empty, returns {@code null}.
     *
     * @return The first element of the queue or {@code null} if the queue is empty.
     */
    String peek();

    /**
     * Retrieves, but does not remove, the first element of the queue.
     * If the queue is empty, throws a {@link java.util.NoSuchElementException}.
     *
     * @return The first element of the queue.
     * @throws java.util.NoSuchElementException if the queue is empty.
     */
    String element();
}
```
`6. public class Main:`
 - **The main method is the starting point of the application.**
In your main() method, you can create the drinks and then call the method.
-  This is a standard body of a Main class, to see an example of the program's application, look for the link to the example in the section: ⬇️ 🎊 How to make the code more interesting 🎊 ⬇️ .

```
package at.fhj.msd;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        
        ...
    }
}

```
`7.  public class Cocktail:`
```
package at.fhj.msd;

import java.util.List;

/**
 * Class represents a cocktail drink consisting of multiple liquid ingredients.
 * Implements the Drink interface.
 */
public class Cocktail implements Drink {

    private String name;
    private List<Liquid> ingredients;

    /**
     * Constructor to create a Cocktail object.
     * 
     * @param name name of the cocktail
     * @param ingredients list of liquids
     */
    public Cocktail(String name, List<Liquid> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    /**
     * Returns total volume of the drink.
     * 
     * @return total volume
     */
    @Override
    public double getVolume() {
        return ingredients.stream()
                          .mapToDouble(Liquid::getVolume)
                          .sum();
    }

    /**
     * Calculates and returns alcohol percent based on all ingredients.
     * 
     * @return alcohol percent
     */
    @Override
    public double getAlcoholPercent() {
        double totalVolume = getVolume();
        if (totalVolume == 0) return 0;
        double alcoholSum = ingredients.stream()
            .mapToDouble(l -> l.getVolume() * l.getAlcoholPercent())
            .sum();
        return alcoholSum / totalVolume;
    }

    /**
     * Checks if the drink contains any alcohol.
     * 
     * @return true if any ingredient is alcoholic
     */
    @Override
    public boolean isAlcoholic() {
        return ingredients.stream()
                          .anyMatch(l -> l.getAlcoholPercent() > 0);
    }

    /**
     * Gets the name of the cocktail.
     * 
     * @return name
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the cocktail.
     * 
     * @param name new name
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the list of ingredients.
     * 
     * @return ingredients
     */
    public List<Liquid> getIngredients() {
        return ingredients;
    }

    /**
     * Sets the list of ingredients.
     * 
     * @param ingredients new list of ingredients
     */
    public void setIngredients(List<Liquid> ingredients) {
        this.ingredients = ingredients;
    }
}
```
`8. public class DrinkQueue:`
```
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

```