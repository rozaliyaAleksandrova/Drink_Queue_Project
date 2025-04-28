package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DrinkTest {
    private Drink alcoholicDrink;
    private Drink nonAlcoholicDrink;

    @BeforeEach
    void setUp() {
        Liquid vodka = new Liquid("Vodka", 0.05, 40);
        Liquid water = new Liquid("Water", 0.5, 0);
        alcoholicDrink = new SimpleDrink("Vodka Shot", vodka);
        nonAlcoholicDrink = new SimpleDrink("Water", water);
    }

    @Test
    void testGetVolume() {
        // Verify that getVolume() returns the correct volume of the drink
        assertEquals(0.05, alcoholicDrink.getVolume(), 0.001);
    }

    @Test
    void testGetAlcoholPercent() {
        // Verify that getAlcoholPercent() returns the correct alcohol percentage
        // for an alcoholic drink
        assertEquals(40, alcoholicDrink.getAlcoholPercent(), 0.001);
        assertEquals(0, nonAlcoholicDrink.getAlcoholPercent(), 0.001);
    }

    @Test
    void testIsAlcoholic() {
        // Verify that isAlcoholic() correctly identifies alcoholic drinks
        assertTrue(alcoholicDrink.isAlcoholic());
        // And correctly identifies non-alcoholic drinks
        assertFalse(nonAlcoholicDrink.isAlcoholic());
    }

    @Test
    void testNameOperations() {
        // Verify that setName() correctly updates the drink's name
        alcoholicDrink.setName("Changed");
        assertEquals("Changed", alcoholicDrink.getName());
    }
}