package at.fhj.msd;

/**
 *The class represents a simple drink consisting of a single liquid.
 * It can be used to model drinks made from one type of liquid.
 */
public class SimpleDrink extends Drink{

    /**
     * The liquid contained in this drink.
     */
    protected Liquid l;

    /**
     * Creates a SimpleDrink object with the given name and liquid.
     *
     * @param name name of drink
     * @param l theliquid contained in the drink
     */
    public SimpleDrink(String name, Liquid l) {
        this.name = name;
        this.l = l;
    }

    /**
     * Returns volume of the liquid.
     *
     * @return the volume of drink in liters
     */
    @Override
    public double getVolume() {
        return l.getVolume();
    }

    /**
     * Returns the alcohol volume percentage of the liquid.
     *
     * @return alcohol volume percent
     */
    @Override
    public double getAlcoholPercent() {
        return l.getAlcoholPercent();
    }

    /**
     * Indicates whether the drink is alcoholic or not.
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