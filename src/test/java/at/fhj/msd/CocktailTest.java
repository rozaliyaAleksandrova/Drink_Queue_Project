package at.fhj.msd;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class CocktailTest {
    @Test
    void testCocktailProperties() {
        List<Liquid> ingredients = Arrays.asList(
            new Liquid("Rum", 0.04, 40),
            new Liquid("Cola", 0.15, 0)
        );
        Cocktail cocktail = new Cocktail("Cuba Libre", ingredients);

        assertEquals(0.19, cocktail.getVolume(), 0.001);
        assertEquals(8.42, cocktail.getAlcoholPercent(), 0.01);
        assertTrue(cocktail.isAlcoholic());
        assertEquals("Cuba Libre", cocktail.getName());
    }

    @Test
    void testZeroAlcoholCocktail() {
        List<Liquid> ingredients = Arrays.asList(
            new Liquid("Juice", 0.2, 0)
        );
        Cocktail mocktail = new Cocktail("Mocktail", ingredients);
        
        assertFalse(mocktail.isAlcoholic());
        assertEquals(0, mocktail.getAlcoholPercent(), 0.001);
    }
}