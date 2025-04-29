package at.fhj.msd;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class CocktailTest {
    
    /**
     * Tests core functionality of the Cocktail class including:
     * - Volume calculation 
     * - Alcohol percentage calculation 
     * - Alcoholic status detection
     * - Name property handling
     */
    @Test
    void testCocktailProperties() {
        //Create a cocktail with alcoholic and non-alcoholic ingredients
        List<Liquid> ingredients = Arrays.asList(
            // Alcoholic component
            new Liquid("Rum", 0.04, 40), 
            // Non-alcoholic component
            new Liquid("Cola", 0.15, 0)     
        );
        Cocktail cocktail = new Cocktail("Cuba Libre", ingredients);

        // Verify total volume (0.04 + 0.15 = 0.19)
        assertEquals(0.19, cocktail.getVolume(), 0.001, 
            "Total volume should be sum of all ingredients' volumes");
        
        // Verify alcohol percentage calculation:
        // (0.04*40 + 0.15*0)/0.19 ≈ 8.42%
        assertEquals(8.42, cocktail.getAlcoholPercent(), 0.01,
            "Alcohol percentage should be weighted average of ingredients");
        
        // Verify cocktail is recognized as alcoholic
        assertTrue(cocktail.isAlcoholic(),
            "Cocktail should be alcoholic when containing any alcoholic ingredient");
        
        // Verify name property
        assertEquals("Cuba Libre", cocktail.getName(),
            "Cocktail should maintain its assigned name");
    }

    /**
     * Tests edge case with zero-alcohol cocktail:
     * - Correct identification as non-alcoholic
     * - 0% alcohol calculation
     * - Single-ingredient handling
     */
    @Test
    void testZeroAlcoholCocktail() {
        //Create cocktail with only non-alcoholic ingredient
        List<Liquid> ingredients = Arrays.asList(

        // Non-alcoholic only
            new Liquid("Juice", 0.2, 0)  
        );
        Cocktail mocktail = new Cocktail("Mocktail", ingredients);
        
        // Verify non-alcoholic status
        assertFalse(mocktail.isAlcoholic(),
            "Cocktail should be non-alcoholic when all ingredients have 0% alcohol");
        
        // Verify 0% alcohol calculation
        assertEquals(0, mocktail.getAlcoholPercent(), 0.001,
            "Alcohol percentage should be exactly 0 for non-alcoholic cocktails");
    }
    /**
     * Tests the getIngredients and setIngredients methods.
     */
        @Test
        void testGetAndSetIngredients() {
    // Create a list of ingredients
    List<Liquid> initialIngredients = Arrays.asList(
        new Liquid("Wasser", 0.2, 0),
        new Liquid("Saft", 0.3, 0)
    );
    Cocktail cocktail = new Cocktail("Testcocktail", initialIngredients);

    // Check if getIngredients() returns the correct list
    assertEquals(initialIngredients, cocktail.getIngredients(), "getIngredients sollte die ursprüngliche Zutatenliste zurückgeben");

    // Create new ingredients list
    List<Liquid> newIngredients = Arrays.asList(
        new Liquid("Sirup", 0.1, 0),
        new Liquid("Eis", 0.05, 0)
    );

    // call setIngredients()
    cocktail.setIngredients(newIngredients);

    // Check if the ingredients list has been updated
    assertEquals(newIngredients, cocktail.getIngredients(), "Nach setIngredients sollte die Zutatenliste aktualisiert sein");
}

    /**
     * Tests the setName() method.
     */
     @Test
     void testSetName() {
     List<Liquid> ingredients = Arrays.asList(
        new Liquid("Wasser", 0.2, 0)
    );
    Cocktail cocktail = new Cocktail("AlterName", ingredients);

    // Check if the name was set correctly
    assertEquals("AlterName", cocktail.getName(), "Initialer Name sollte korrekt sein");

    // call setName() to change the name
    cocktail.setName("NeuerName");

    // Check if the name has been updated
    assertEquals("NeuerName", cocktail.getName(), "Der Name sollte nach setName aktualisiert sein");
}
    /**
     * Tests the with getAlcoholPercent() with negative volume.
     */
@Test
void testNegativeVolume() {
    // Create ingredients with negative volume 
    List<Liquid> ingredients = Arrays.asList(
        new Liquid("ErrorLiquid", -0.1, 10)
    );
    Cocktail cocktail = new Cocktail("InvalidCocktail", ingredients);
    
    // Should handle negative volume and return 0
    assertEquals(0, cocktail.getAlcoholPercent(), 0.001,
        "Should return 0 when total volume is negative");
}


}