package decorador;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class HouseBlendTest {
    private Beverage b;

    @Before
    public void setUp() throws Exception {
        b = new HouseBlend();
    }

    @Test
    public void testHouseBlendDescripcion() {
        assertEquals("House Blend Coffee", b.description);

    }

    @Test
    public void testHouseBlendCost() {
        assertEquals(0.89, b.cost(), 0.01 );
    }

    @Test
    public void testHouseBlendWithMilk() {
        b = new Milk(b);
        assertEquals("House Blend Coffee, Steamed Milk", b.getDescription());
        assertEquals(0.89 + 0.10, b.cost(), 0.01);
    }

    @Test
    public void testHouseBlendWithSoyAndWhip() {
        b = new Soy(b);
        b = new Whip(b);
        assertEquals("House Blend Coffee, Soy, Whip", b.getDescription());
        assertEquals(0.89 + 0.15 + 0.10, b.cost(), 0.01);
    }


    @Test
    public void testToString() {
        assertEquals("HouseBlend{description='House Blend Coffee'}", b.toString());
    }
}