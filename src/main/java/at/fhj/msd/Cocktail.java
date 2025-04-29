package at.fhj.msd;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Class represents a cocktail drink consisting of multiple liquid ingredients.
 * Implements the Drink interface.
 */
public class Cocktail implements Drink {

    private static final Logger logger = LogManager.getLogger(Cocktail.class);

    private String name;
    private List<Liquid> ingredients;

    /**
     * Constructor to create a Cocktail object.
     * 
     * @param name name of the cocktail
     * @param ingredients list of liquids
     */
    public Cocktail(String name, List<Liquid> ingredients) {
        logger.debug("Creating new Cocktail: {}", name); 
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
        // Handle cases where total volume is zero or negative
        if (totalVolume <= 0) {
            logger.debug("Zero or negative volume for {}, returning 0 alcohol", name);
            return 0;
        }
        // Calculate total alcohol content
        double alcoholSum = ingredients.stream()
            .mapToDouble(l -> l.getVolume() * l.getAlcoholPercent())
            .sum();
        double percent = alcoholSum / totalVolume;
        logger.debug("Calculated alcohol percent for {}: {}", name, percent);
        double roundedPercent = Math.round(percent * 100) / 100.0;
        logger.debug("Calculated alcohol percent for {}: {}", name, roundedPercent);
        return roundedPercent;
    }

    /**
     * Checks if the drink contains any alcohol.
     * 
     * @return true if any ingredient is alcoholic
     */
    @Override
    public boolean isAlcoholic() {
        boolean alcoholic = ingredients.stream()
                          .anyMatch(l -> l.getAlcoholPercent() > 0);
        logger.debug("Checked if {} is alcoholic: {}", name, alcoholic);
        return alcoholic;
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