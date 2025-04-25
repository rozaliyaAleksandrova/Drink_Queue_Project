package at.fhj.msd;
<<<<<<< HEAD
=======

>>>>>>> 1d8dccbe3650dc4977bc3bc50544738cbe45ef3c
/**
<<<<<<< HEAD
 * Class represents a simple drink liquid which can be used in drinks.
 */
public class SimpleDrink implements Drink {

    /**
     * The only liquid contained in the drink.
=======
 *This class represents a simple drink consisting of a single liquid.
 * It can be used to model drinks made from one type of liquid.
 */
public class SimpleDrink extends Drink{

    /**
     * The liquid contained in this drink.
>>>>>>> bug_hunt
     */
    protected Liquid l;

    /**
<<<<<<< HEAD
     * Name of the drink.
     */
    protected String name;

    /**
     * Creates a SimpleDrink object with given name and liquid.
=======
     * Creates a SimpleDrink object with the given name and liquid.
>>>>>>> bug_hunt
     *
     * @param name name of drink
     * @param l only liquid in drink
     */
<<<<<<< HEAD
    public SimpleDrink(String name, Liquid l) {
        this.name = name;
=======
    public SimpleDrink(String name, Liquid l){
        super(name);
>>>>>>> bug_hunt
        this.l = l;
    }

    /**
<<<<<<< HEAD
     * Returns volume of the liquid.
     *
     * @return the volume of drink in litre
=======
     * Returns the volume of the liquid in liters.
>>>>>>> bug_hunt
     */
    @Override
    public double getVolume() {
        return l.getVolume();
    }

    /**
<<<<<<< HEAD
     * Returns alcohol volume percent of the liquid.
     *
     * @return alcohol volume percent
=======
     * Returns the alcohol volume percentage of the liquid.
>>>>>>> bug_hunt
     */
    @Override
    public double getAlcoholPercent() {
        return l.getAlcoholPercent();
    }

    /**
<<<<<<< HEAD
     * Gives information if drink is alcoholic or not.
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    @Override
    public boolean isAlcoholic() {
        return l.getAlcoholPercent() > 0;
=======
     * Indicates whether the drink is alcoholic.
     */
    @Override
    public boolean isAlcoholic() {
            return l.getAlcoholPercent() > 0;
>>>>>>> bug_hunt
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