package at.fhj.msd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LiquidTest {
    @Test
    void testLiquidProperties() {
        // Create a new Liquid instance with initial properties
        Liquid liquid = new Liquid("Test", 1.5, 40);
        // Verify that the getName() method returns the correct name
        assertEquals("Test", liquid.getName());
        // Verify that the getVolume() method returns the correct volume within a small delta
        assertEquals(1.5, liquid.getVolume(), 0.001);
        // Verify that the getAlcoholPercent() method returns the correct alcohol percentage within a small delta
        assertEquals(40, liquid.getAlcoholPercent(), 0.001);
        
        // Change the properties of the Liquid object
        liquid.setName("Changed");
        liquid.setVolume(2.0);
        liquid.setAlcoholPercent(50);
        
        // Verify that the getName() method reflects the updated name
        assertEquals("Changed", liquid.getName());
        // Verify that the getVolume() method reflects the updated volume within a small delta
        assertEquals(2.0, liquid.getVolume(), 0.001);
        // Verify that the getAlcoholPercent() method reflects the updated alcohol percentage within a small delta  
        assertEquals(50, liquid.getAlcoholPercent(), 0.001);
    }
}