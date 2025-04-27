package at.fhj.msd;

import java.util.List;

/**
 * Class represents a cocktail drink consisting of multiple liquid ingredients.
 * Implements the Drink interface.
 */
public class Cocktail implements Drink {

    private String name;
    private List<Liquid> ingredients;

    /**
     * Constructor to create a Cocktail object.
     * 
     * @param name name of the cocktail
     * @param ingredients list of liquids
     */
    public Cocktail(String name, List<Liquid> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    /**
     * Returns total volume of the drink.
     * 
     * @return total volume
     */
    @Override
    public double getVolume() {
        return ingredients.stream()
                          .mapToDouble(Liquid::getVolume)
                          .sum();
    }

    /**
     * Calculates and returns alcohol percent based on all ingredients.
     * 
     * @return alcohol percent
     */
    @Override
    public double getAlcoholPercent() {
        double totalVolume = getVolume();
        if (totalVolume == 0) return 0;
        double alcoholSum = ingredients.stream()
            .mapToDouble(l -> l.getVolume() * l.getAlcoholPercent())
            .sum();
        return alcoholSum / totalVolume;
    }

    /**
     * Checks if the drink contains any alcohol.
     * 
     * @return true if any ingredient is alcoholic
     */
    @Override
    public boolean isAlcoholic() {
        return ingredients.stream()
                          .anyMatch(l -> l.getAlcoholPercent() > 0);
    }

    /**
     * Gets the name of the cocktail.
     * 
     * @return name
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the cocktail.
     * 
     * @param name new name
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the list of ingredients.
     * 
     * @return ingredients
     */
    public List<Liquid> getIngredients() {
        return ingredients;
    }

    /**
     * Sets the list of ingredients.
     * 
     * @param ingredients new list of ingredients
     */
    public void setIngredients(List<Liquid> ingredients) {
        this.ingredients = ingredients;
    }
}