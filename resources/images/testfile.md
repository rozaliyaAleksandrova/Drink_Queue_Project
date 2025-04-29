## Test your code 

Create drinks in your main() method in the Main class and then call the method to test whether individual classes are working correctly:
 
 ```
package at.fhj.msd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Testing Drink System Implementation: \n");

        // Test 1: Basic Liquid functionality
        System.out.println("=== Testing Liquid Class ===" + //
                        "");
        Liquid water = new Liquid("Water", 0.5, 0);
        Liquid vodka = new Liquid("Vodka", 0.05, 40);
        testLiquid(water);
        testLiquid(vodka);
        System.out.println();

        // Test 2: SimpleDrink implementation
        System.out.println("=== Testing SimpleDrink Class === \n");
        SimpleDrink cola = new SimpleDrink("Cola", water);
        SimpleDrink vodkaShot = new SimpleDrink("Vodka Shot", vodka);
        testSimpleDrink(cola);
        testSimpleDrink(vodkaShot);
        System.out.println();

        // Test 3: Cocktail implementation
        System.out.println("=== Testing Cocktail Class === \n");
        List<Liquid> mojitoIngredients = Arrays.asList(
            new Liquid("Rum", 0.04, 40),
            new Liquid("Soda Water", 0.15, 0),
            new Liquid("Lime Juice", 0.01, 0),
            new Liquid("Sugar Syrup", 0.01, 0)
        );
        Cocktail mojito = new Cocktail("Mojito", mojitoIngredients);
        testCocktail(mojito);
        System.out.println();

        // Test 4: DrinkQueue functionality
        System.out.println("=== Testing DrinkQueue Class === \n");
        testDrinkQueue();
        System.out.println();

        // Test 5: StringQueue functionality
        System.out.println("=== Testing StringQueue Class === \n");
        testStringQueue();
    }

    private static void testLiquid(Liquid liquid) {
        System.out.println("\n Testing " + liquid.getName() + ": \n");
        System.out.printf(" Volume: %.2f liters%n", liquid.getVolume());
        System.out.printf(" Alcohol: %.1f%%%n", liquid.getAlcoholPercent());
        System.out.println(" Is alcoholic? " + (liquid.getAlcoholPercent() > 0));
    }

    private static void testSimpleDrink(SimpleDrink drink) {
        System.out.println("Testing " + drink.getName() + ":");
        System.out.printf("Total volume: %.2f liters%n", drink.getVolume());
        System.out.printf("Alcohol percentage: %.1f%%%n", drink.getAlcoholPercent());
        System.out.println("Is alcoholic? " + drink.isAlcoholic());
        
        // Test liquid access
        Liquid liquid = drink.getLiquid();
        System.out.println("Contains liquid: " + liquid.getName());
    }

    private static void testCocktail(Cocktail cocktail) {
        System.out.println("Testing " + cocktail.getName() + ":");
        System.out.printf("Total volume: %.2f liters%n", cocktail.getVolume());
        System.out.printf("Average alcohol: %.1f%%%n", cocktail.getAlcoholPercent());
        System.out.println("Is alcoholic? " + cocktail.isAlcoholic());
        
        // Display ingredients
        System.out.println("Ingredients:");
        for (Liquid ingredient : cocktail.getIngredients()) {
            System.out.printf("   %s (%.2fL, %.1f%%)%n", 
                ingredient.getName(),
                ingredient.getVolume(),
                ingredient.getAlcoholPercent());
        }
    }

    private static void testDrinkQueue() {
        DrinkQueue queue = new DrinkQueue();
        
        // Create test drinks
        Drink cola = new SimpleDrink("Cola", new Liquid("Cola", 0.33, 0));
        Drink beer = new SimpleDrink("Beer", new Liquid("Beer", 0.5, 5));
        
        // Test offer and peek
        System.out.println("Adding drinks to queue...");
        queue.offer(cola);
        queue.offer(beer);
        System.out.println("First drink in queue: " + queue.peek().getName());
        
        // Test poll
        Drink served = queue.poll();
        System.out.println("Served: " + served.getName());
        System.out.println("Next drink: " + queue.peek().getName());
        
        // Test queue size
        System.out.println("Queue size: " + queue.size());
    }

    private static void testStringQueue() {
        StringQueue queue = new StringQueue(3);
        
        // Test offer
        System.out.println("Adding elements to queue...");
        System.out.println("Offer 'First': " + queue.offer("First"));
        System.out.println("Offer 'Second': " + queue.offer("Second"));
        System.out.println("Offer 'Third': " + queue.offer("Third"));
        System.out.println("Offer 'Fourth' (should fail): " + queue.offer("Fourth"));
        
        // Test peek and poll
        System.out.println("Peek: " + queue.peek());
        System.out.println("Poll: " + queue.poll());
        System.out.println("New peek: " + queue.peek());
        
        // Test element and remove
        System.out.println("Element: " + queue.element());
        System.out.println("Remove: " + queue.remove());
        
        // Test empty queue behavior
        try {
            System.out.println("Trying remove on empty queue...");
            queue.remove();
        } catch (NoSuchElementException e) {
            System.out.println("Caught expected exception: " + e.getMessage());
        }
    }
}
```
