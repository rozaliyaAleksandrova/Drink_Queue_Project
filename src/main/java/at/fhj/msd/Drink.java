package at.fhj.msd;

/**
 * Interface representing a general drink.
 * Provides methods to access volume, alcohol content, and name.
 */
<<<<<<< HEAD

public abstract class Drink {

    /**
     * Name of the drink
     */

    protected String name;
    
    /**
     * Creates a Drink object with given name
     *
     * @param name name of the drink
     *
     */

    public Drink(String name) {

        this.name = name;
    }

    /**
     * Calculates and returns volume of drink
     *
     * @return the volume of drink in liter
     */

    public abstract double getVolume();

    /**
     * Calculates and returns the alcohol percentage
     *
     * @return alcohol volume percent (e.g. 50)
     */

    public abstract double getAlcoholPercent();
    
    /**
     * Gives information if drink is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise false
     */

    public abstract boolean isAlcoholic();
=======
public interface Drink {
>>>>>>> 1d8dccbe3650dc4977bc3bc50544738cbe45ef3c

    /**
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
}