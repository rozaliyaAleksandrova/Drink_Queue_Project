package at.fhj.msd;

/**
<<<<<<< HEAD
 * Interface representing a general drink.
 * Provides methods to access volume, alcohol content, and name.
=======
 * Abstract base class for concrete drink classes.
 * Defines common properties and methods for all drinks.
>>>>>>> bug_hunt
 */
<<<<<<< HEAD

public abstract class Drink {

    /**
     * Name of the drink.
     */
    protected String name;
    
    /**
     * Constructor to create a Drink object with a given name.
     */
    public Drink(String name) {
        this.name = name;
    }

    /**
     * Calculates and returns the volume of the drink.
     */
    public abstract double getVolume();

    /**
     * Calculates and returns the alcohol percentage of the drink.
     */
    public abstract double getAlcoholPercent();

    /**
     * Indicates whether the drink contains alcohol.
     */
    public abstract boolean isAlcoholic();
=======
public interface Drink {
>>>>>>> 1d8dccbe3650dc4977bc3bc50544738cbe45ef3c

    /**
<<<<<<< HEAD
     * Returns the total volume of the drink in litres.
     * @return volume in litres
     */
    double getVolume();

    /**
     * Returns the alcohol percentage of the drink.
     * @return alcohol percent (e.g., 40 means 40%)
     */
    double getAlcoholPercent();

    /**
     * Checks if the drink contains alcohol.
     * @return true if alcohol > 0, false otherwise
     */
    boolean isAlcoholic();

    /**
     * Gets the name of the drink.
     * @return name of the drink
     */
    String getName();

    /**
     * Sets the name of the drink.
     * @param name name to set
     */
    void setName(String name);
=======
     * Gets the name of the drink.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the drink.
     */
    public void setName(String name) {
        this.name = name;
    }
>>>>>>> bug_hunt
}