package at.fhj.msd;

/**
 * Abstract base class for concrete drink classes.
 * Defines common properties and methods for all drinks.
 */

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

    /**
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
}