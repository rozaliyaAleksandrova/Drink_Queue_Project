package at.fhj.msd;
/**
 * This is the abstract class for all drinks.
 * It contains the common properties and methods for all drinks.
 * The concrete drink classes will extend this class and implement the abstract methods.
 */

public interface Drink {
    /**
     * Returns the volume of the drink in litres.
     *
     * @return the volume of the drink             
     */
    double getVolume();

    /**
     * Returns the alcohol volume percent of the drink.
     *
     * @return the alcohol volume percent
     */
    double getAlcoholPercent();

    /**
     * Checks if the drink is alcoholic.
     *
     * @return true if the drink is alcoholic, false otherwise
     */
    boolean isAlcoholic();
    /**
     * Returns the name of the drink.
     *
     * @return the name of the drink
     */
    String getName();
    /**
     * Sets the name of the drink.
     *
     * @param name the new name of the drink
     */
    void setName(String name);
}
