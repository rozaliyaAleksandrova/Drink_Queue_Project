package at.fhj.msd;
/**
 *This class represents a simple drink consisting of a single liquid.
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
     * @param l only liquid in drink
     */
    public SimpleDrink(String name, Liquid l){
        super(name);
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
}
