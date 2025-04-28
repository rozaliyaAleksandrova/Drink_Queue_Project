package at.fhj.msd;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Creating of simple liquids
        Liquid water = new Liquid("Water", 0.5, 0.0);
        Liquid vodka = new Liquid("Vodka", 0.05, 40);
        Liquid cola = new Liquid("Cola", 0.33, 0);
        
        // 2. Making simple drinks
        Drink waterDrink = new SimpleDrink("Mineral Water", water);
        Drink vodkaDrink = new SimpleDrink("Vodka Shot", vodka);
        Drink colaDrink = new SimpleDrink("Cola", cola);
        
        // 3. Creating a cocktail
        List<Liquid> mojitoIngredients = Arrays.asList(
            new Liquid("Rum", 0.04, 40),
            new Liquid("Soda Water", 0.15, 0),
            new Liquid("Lime Juice", 0.01, 0)
        );
        Drink mojito = new Cocktail("Mojito", mojitoIngredients);
        
        // 4. Demonstration of the beverages
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
        
        System.out.println("\n === Serving drinks from a queue ===");
        while (!drinkQueue.isEmpty()) {
            Drink served = drinkQueue.poll();
            System.out.println("Served:" + served.getName());
        }
    }
    
    static void printDrinkInfo(Drink drink) {
        System.out.println("Drink: " + drink.getName());
        System.out.printf("Volume: %.2f liters \n", drink.getVolume());
        System.out.printf("Alcohol: %.1f%% \n", drink.getAlcoholPercent());
        System.out.println("Alcoholic: " + (drink.isAlcoholic() ? "Yes" : "No"));
        System.out.println();
    }
}


