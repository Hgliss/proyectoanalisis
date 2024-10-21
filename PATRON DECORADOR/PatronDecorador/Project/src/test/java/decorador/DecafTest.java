package decorador;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DecafTest {
    private Beverage b;

    @Before
    public void setUp() throws Exception {
        b = new Decaf();

    }

    @Test
    public void testDecafDescripcion() {
        assertEquals("Decaf Coffee", b.description);

    }

    @Test
    public void testDecafCost() {
        assertEquals(1.05, b.cost(), 0.01 );
    }

    @Test
    public void testDecafWithMocha() {
        b = new Mocha(b);
        assertEquals("Decaf Coffee, Mocha", b.getDescription());
        assertEquals(1.05 + 0.20, b.cost(), 0.01);
    }

    @Test
    public void testDecafWithMochaAndWhip() {
        b = new Mocha(b);
        b = new Whip(b);
        assertEquals("Decaf Coffee, Mocha, Whip", b.getDescription());
        assertEquals(1.05 + 0.20 + 0.10, b.cost(), 0.01);
    }


    @Test
    public void testToString() {
        assertEquals("Decaf{description='Decaf Coffee'}", b.toString());
    }
}