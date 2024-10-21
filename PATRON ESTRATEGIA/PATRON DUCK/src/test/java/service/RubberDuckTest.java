package service;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class RubberDuckTest {
    private RubberDuck rb;
    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        rb = new RubberDuck();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testSwim() {
        rb.swim();
        assertTrue(out.toString().toLowerCase().contains("the duck is swimming"));
    }
    @Test
    public void testFly() {
        rb.performFly();
        assertTrue(out.toString().toLowerCase().contains("i cannot fly"));
    }
    @Test
    public void testQuack() {
        rb.performQuack();
        assertTrue(out.toString().toLowerCase().contains("i cannot make sound"));
    }
    @Test
    public void testDisplay() {
        rb.display();
        assertTrue(out.toString().toLowerCase().contains("hi i am a rubberduck"));
    }

    @Test
    public void testToString() {
        String esperado = "rubberduck{}";
        String obtenido = rb.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}