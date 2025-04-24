package main.java.at.fhj.msd;

import java.util.List;

/**
 * Class represents a cocktail drink consisting of multiple liquid ingredients
 */
public class Cocktail implements Drink {

    private String name;
    private List<Liquid> ingredients;

    /**
     * Creates a Cocktail object with given name and list of liquids
     * @param name        name of the cocktail
     * @param ingredients list of liquid ingredients
     */
    public Cocktail(String name, List<Liquid> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    @Override
    public double getVolume() {
        return ingredients.stream()
                          .mapToDouble(Liquid::getVolume)
                          .sum();
    }

    @Override
    public double getAlcoholPercent() {
        double totalVolume = getVolume();
        if (totalVolume == 0) return 0;
        double alcoholSum = ingredients.stream()
            .mapToDouble(l -> l.getVolume() * l.getAlcoholPercent())
            .sum();
        return alcoholSum / totalVolume;
    }

    @Override
    public boolean isAlcoholic() {
        return ingredients.stream()
                          .anyMatch(l -> l.getAlcoholPercent() > 0);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public List<Liquid> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Liquid> ingredients) {
        this.ingredients = ingredients;
    }
}