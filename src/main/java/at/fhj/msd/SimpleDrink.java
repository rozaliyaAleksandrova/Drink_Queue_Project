package at.fhj.msd;
<<<<<<< HEAD
=======

>>>>>>> 1d8dccbe3650dc4977bc3bc50544738cbe45ef3c
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