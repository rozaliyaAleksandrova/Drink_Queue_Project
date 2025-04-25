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
     * Returns the volume of the liquid in liters.
     */
    @Override
    public double getVolume() {
        return l.getVolume();
    }

    /**
     * Returns the alcohol volume percentage of the liquid.
     */
    @Override
    public double getAlcoholPercent() {
        return l.getAlcoholPercent();
    }

    /**
     * Indicates whether the drink is alcoholic.
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