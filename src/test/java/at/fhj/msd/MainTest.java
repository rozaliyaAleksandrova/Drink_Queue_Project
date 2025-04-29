package at.fhj.msd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

/**
 *Tests core functionality of the Main class
 * @author Rozaliya Aleksandrova
 * @version 1.0
 */ 
class MainTest {

    @Test
    void testMainMethodRunsWithoutErrors() {
        // Redirect System.out to capture output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Execute main method
        Main.main(new String[]{});

        // Restore original System.out
        System.setOut(originalOut);

        // Verify that the output contains expected strings
        String output = outputStream.toString();
        assertTrue(output.contains("=== Simple drinks ==="));
        assertTrue(output.contains("=== Cocktail ==="));
        assertTrue(output.contains("Served:"));
    }

    @Test
    void testDrinkCreation() {
        // Test if drinks are created correctly
        Liquid water = new Liquid("Water", 0.5, 0.0);
        Drink waterDrink = new SimpleDrink("Mineral Water", water);
        
        assertEquals("Mineral Water", waterDrink.getName());
        assertEquals(0.5, waterDrink.getVolume());
        assertEquals(0.0, waterDrink.getAlcoholPercent());
        assertFalse(waterDrink.isAlcoholic());
    }

    @Test
    void testCocktailCreation() {
        // Test if cocktail is created correctly
        List<Liquid> mojitoIngredients = List.of(
            new Liquid("Rum", 0.04, 40),
            new Liquid("Soda Water", 0.15, 0),
            new Liquid("Lime Juice", 0.01, 0)
        );
        Drink mojito = new Cocktail("Mojito", mojitoIngredients);
        
        assertEquals("Mojito", mojito.getName());
        assertEquals(0.20, mojito.getVolume()); // 0.04 + 0.15 + 0.01 = 0.20
        assertTrue(mojito.getAlcoholPercent() > 0); // Should be alcoholic
    }

    @Test
    void testDrinkQueueFunctionality() {
        DrinkQueue queue = new DrinkQueue();
        Liquid cola = new Liquid("Cola", 0.33, 0);
        Drink colaDrink = new SimpleDrink("Cola", cola);
        
        assertTrue(queue.offer(colaDrink));
        assertFalse(queue.isEmpty());
        
        Drink servedDrink = queue.poll();
        assertEquals("Cola", servedDrink.getName());
        assertTrue(queue.isEmpty());
    }
}