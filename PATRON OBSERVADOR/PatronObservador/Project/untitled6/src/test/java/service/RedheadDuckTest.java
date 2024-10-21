package service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class RedheadDuckTest {
    private Duck d;
    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        d = new RedheadDuck();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testSwim() {
        d.swim();
        assertTrue(out.toString().toLowerCase().contains("the duck is swimming"));
    }
    @Test
    public void testFly() {
        d.fly();
        assertTrue(out.toString().toLowerCase().contains("the duck is flying"));
    }
    @Test
    public void testQuack() {
        d.quack();
        assertTrue(out.toString().toLowerCase().contains("the duck is quacking"));
    }
    @Test
    public void testDisplay() {
        d.display();
        assertTrue(out.toString().toLowerCase().contains("hi i am a redhead duck"));
    }



    @Test
    public void testToString() {
        String esperado = "redheadduck{}";
        String obtenido = d.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}