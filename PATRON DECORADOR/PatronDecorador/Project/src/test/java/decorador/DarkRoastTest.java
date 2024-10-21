package decorador;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DarkRoastTest {
    private Beverage b;

    @Before
    public void setUp() throws Exception {
        b = new DarkRoast();

    }

    @Test
    public void testDarkRoastDescripcion() {
        assertEquals("Most Excellent Dark Roast", b.description);

    }

    @Test
    public void testDarkRoastCost() {
        assertEquals(0.99, b.cost(), 0.01 );
    }

    @Test
    public void testDarkRoastWithMocha() {
        b = new Mocha(b);
        assertEquals("Most Excellent Dark Roast, Mocha", b.getDescription());
        assertEquals(0.99 + 0.20, b.cost(), 0.01);
    }

    @Test
    public void testDarkRoastWithMochaAndWhip() {
        b = new Mocha(b);
        b = new Whip(b);
        assertEquals("Most Excellent Dark Roast, Mocha, Whip", b.getDescription());
        assertEquals(0.99 + 0.20 + 0.10, b.cost(), 0.01);
    }


    @Test
    public void testToString() {
        assertEquals("DarkRoast{description='Most Excellent Dark Roast'}", b.toString());
    }
}