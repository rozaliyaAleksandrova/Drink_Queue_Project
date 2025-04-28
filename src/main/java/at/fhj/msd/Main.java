package at.fhj.msd;

import java.util.Arrays;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    
    public static void main(String[] args) {
        logger.info("Starting application");
        
        try {
            // 1. Creating of simple liquids
            Liquid water = new Liquid("Water", 0.5, 0.0);
            logger.debug("Created water liquid");
            
            Liquid vodka = new Liquid("Vodka", 0.05, 40);
            logger.debug("Created vodka liquid");
            
            Liquid cola = new Liquid("Cola", 0.33, 0);
            logger.debug("Created cola liquid");
            
            // 2. Making simple drinks
            Drink waterDrink = new SimpleDrink("Mineral Water", water);
            Drink vodkaDrink = new SimpleDrink("Vodka Shot", vodka);
            Drink colaDrink = new SimpleDrink("Cola", cola);
            logger.info("Created simple drinks");
            
            // 3. Creating a cocktail
            List<Liquid> mojitoIngredients = Arrays.asList(
                new Liquid("Rum", 0.04, 40),
                new Liquid("Soda Water", 0.15, 0),
                new Liquid("Lime Juice", 0.01, 0)
            );
            Drink mojito = new Cocktail("Mojito", mojitoIngredients);
            logger.info("Created mojito cocktail");
            
            // 4. Demonstration of the beverages
            logger.debug("Displaying drink information");
            System.out.println("=== Simple drinks ===");
            printDrinkInfo(waterDrink);
            printDrinkInfo(vodkaDrink);
            printDrinkInfo(colaDrink);
            
            System.out.println("\n === Cocktail ===");
            printDrinkInfo(mojito);
            
            // 5. Using a beverage queue
            DrinkQueue drinkQueue = new DrinkQueue();
            drinkQueue.offer(waterDrink);
            drinkQueue.offer(vodkaDrink);
            drinkQueue.offer(mojito);
            logger.info("Added drinks to queue");
            
            System.out.println("\n === Serving drinks from a queue ===");
            while (!drinkQueue.isEmpty()) {
                Drink served = drinkQueue.poll();
                logger.debug("Serving drink: {}", served.getName());
                System.out.println("Served:" + served.getName());
            }
            
            logger.info("Application finished successfully");
        } catch (Exception e) {
            logger.error("Error in main application", e);
        }
    }
    
    static void printDrinkInfo(Drink drink) {
        logger.debug("Printing info for drink: {}", drink.getName());
        System.out.println("Drink: " + drink.getName());
        System.out.printf("Volume: %.2f liters \n", drink.getVolume());
        System.out.printf("Alcohol: %.1f%% \n", drink.getAlcoholPercent());
        System.out.println("Alcoholic: " + (drink.isAlcoholic() ? "Yes" : "No"));
        System.out.println();
    }
}