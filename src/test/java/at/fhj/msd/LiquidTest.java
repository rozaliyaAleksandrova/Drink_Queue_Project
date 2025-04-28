package at.fhj.msd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LiquidTest {
    @Test
    void testLiquidProperties() {
        Liquid liquid = new Liquid("Test", 1.5, 40);
        
        assertEquals("Test", liquid.getName());
        assertEquals(1.5, liquid.getVolume(), 0.001);
        assertEquals(40, liquid.getAlcoholPercent(), 0.001);
        
        liquid.setName("Changed");
        liquid.setVolume(2.0);
        liquid.setAlcoholPercent(50);
        
        assertEquals("Changed", liquid.getName());
        assertEquals(2.0, liquid.getVolume(), 0.001);
        assertEquals(50, liquid.getAlcoholPercent(), 0.001);
    }
}