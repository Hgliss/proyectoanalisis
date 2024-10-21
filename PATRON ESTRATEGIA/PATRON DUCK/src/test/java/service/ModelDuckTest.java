package service;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;
public class ModelDuckTest {
    private Duck mod;
    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        mod = new ModelDuck();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testSwim() {
        mod.swim();
        assertTrue(out.toString().toLowerCase().contains("the duck is swimming"));
    }

    @Test
    public void testFly() {
        mod.performFly();
        assertTrue(out.toString().toLowerCase().contains("i cannot fly"));
    }
    
    @Test
    public void testQuack() {
        mod.performQuack();
        assertTrue(out.toString().toLowerCase().contains("i cannot make sound"));
    }
    @Test
    public void testDisplay() {
        mod.display();
        assertTrue(out.toString().toLowerCase().contains("i am a model duck"));
    }

    @Test
    public void testToString() {
        String esperado = "modelduck{}";
        String obtenido = mod.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testCambioFly (){
        mod.performFly();
        assertTrue(out.toString().toLowerCase().contains("i cannot fly"));

        mod.setFb(new FlyLikeRocket());
        mod.performFly();
        assertTrue(out.toString().toLowerCase().contains("i fly to space"));
    }

}