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
        assertEquals(0.05, alcoholicDrink.getVolume(), 0.001);
    }

    @Test
    void testGetAlcoholPercent() {
        assertEquals(40, alcoholicDrink.getAlcoholPercent(), 0.001);
        assertEquals(0, nonAlcoholicDrink.getAlcoholPercent(), 0.001);
    }

    @Test
    void testIsAlcoholic() {
        assertTrue(alcoholicDrink.isAlcoholic());
        assertFalse(nonAlcoholicDrink.isAlcoholic());
    }

    @Test
    void testNameOperations() {
        alcoholicDrink.setName("Changed");
        assertEquals("Changed", alcoholicDrink.getName());
    }
}