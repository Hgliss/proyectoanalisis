package decorador;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EspressoTest {
    private Beverage b;

    @Before
    public void setUp() throws Exception {
        b = new Espresso();

    }

    @Test
    public void testEspressoDescripcion() {
        assertEquals("Espresso", b.description);

    }

    @Test
    public void testEspressoCost() {
        assertEquals(1.99, b.cost(), 0.01 );
    }

    @Test
    public void testEspressoWithMilk() {
        b = new Milk(b);
        assertEquals("Espresso, Steamed Milk", b.getDescription());
        assertEquals(1.99 + 0.10, b.cost(), 0.01);
    }

    @Test
    public void testEspressoWithSoyAndWhip() {
        b = new Soy(b);
        b = new Whip(b);
        assertEquals("Espresso, Soy, Whip", b.getDescription());
        assertEquals(1.99 + 0.15 + 0.10, b.cost(), 0.01);
    }


    @Test
    public void testToString() {
        assertEquals("Espresso{description='Espresso'}", b.toString());
    }
}