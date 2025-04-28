package at.fhj.msd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SimpleDrinkTest {
/**
 *This test verifies the behavior of the SimpleDrink class, including:
 *- Initialization with a Liquid object
 *- Correct retrieval of properties such as volume, alcohol percentage, and name
 *- The isAlcoholic() method accurately reflects the Liquid's alcohol content
 *- Updating the Liquid to a non-alcoholic version and ensuring that isAlcoholic() method updates accordingly
 */
    @Test
    void testSimpleDrink() {
        //Initialization with a Liquid object.
        Liquid liquid = new Liquid("Test", 0.5, 40);
        SimpleDrink drink = new SimpleDrink("Test Drink", liquid);
        
        assertEquals(0.5, drink.getVolume(), 0.001);
        assertEquals(40, drink.getAlcoholPercent(), 0.001);
        assertTrue(drink.isAlcoholic());
        assertEquals("Test Drink", drink.getName());
        
        drink.setLiquid(new Liquid("Water", 1.0, 0));
        assertFalse(drink.isAlcoholic());
    }
}