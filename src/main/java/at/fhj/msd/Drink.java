package at.fhj.msd;

/**
 * Interface representing a general drink.
 * Provides methods to access volume, alcohol content, and name.
 */
public interface Drink{

    /**
     * Returns the total volume of the drink in liters.
     * @return volume in liters
     */
    double getVolume();

    /**
     * Returns the alcohol percentage of the drink.
     * 
     * @return alcohol percent (e.g., 40 means 40%)
     */
    double getAlcoholPercent();

    /**
     * Checks if the drink contains alcohol.
     * 
     * @return true if alcohol > 0, false otherwise
     */
    boolean isAlcoholic();

    /**
     * Gets the name of the drink.
     * 
     * @return name of the drink
     */
    String getName();

    /**
     * Sets the name of the drink.
     * 
     * @param name name to set
     */
    void setName(String name);
}