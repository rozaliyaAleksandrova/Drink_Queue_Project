package at.fhj.msd;

/**
 * Class represents a simple drink liquid which can be used in
 * drinks
 */
public class SimpleDrink implements Drink{
    /**
     * uses only one liquid
     */
    protected Liquid l;

    protected String name;

    /**
     * Creates a SimpleDrink object with given name and
     * liquid
     *
     * @param name name of drink
     * @param l only liquid in drink
     */
    public SimpleDrink(String name, Liquid l){
        this.name = name;
        this.l = l;
    }

    /**
     * Returns volume of liquid l
     *
     * @return the volume of drink in litre
     */
    @Override
    public double getVolume() {
        return l.getVolume();
    }

    /**
     * Returns alcohol volume percent of liquid l
     *
     * @return alcohol volume percent
     */
    @Override
    public double getAlcoholPercent() {
        return l.getAlcoholPercent();
    }

    /**
     * Gives information if drink is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    @Override
    public boolean isAlcoholic() {
        return l.getAlcoholPercent() > 0;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public Liquid getLiquid() {
        return l;
    }

    public void setLiquid(Liquid l) {
        this.l = l;
    }
}