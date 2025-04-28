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
}