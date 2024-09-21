package furniture;

import static org.junit.Assert.*;
import org.junit.Test;

public class FurnitureFactoryTest {

    public void testModernFurnitureFactory() {
        FurnitureFactory factory = new ModernFurnitureFactory();
        Chair chair = factory.createChair();
        Table table = factory.createTable();
        
        assertEquals("Modern", chair.getStyle());
        assertEquals("Modern", table.getStyle());
    }

    public void testVictorianFurnitureFactory() {
        FurnitureFactory factory = new VictorianFurnitureFactory();
        Chair chair = factory.createChair();
        Table table = factory.createTable();
        
        assertEquals("Victorian", chair.getStyle());
        assertEquals("Victorian", table.getStyle());
    }
}