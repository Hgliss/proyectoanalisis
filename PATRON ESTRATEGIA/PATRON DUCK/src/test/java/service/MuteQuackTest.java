package service;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class MuteQuackTest {
    private MuteQuack mq;
    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        mq = new MuteQuack();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void quack() {
        mq.quack();
        assertTrue(out.toString().toLowerCase().contains("i cannot make sound"));
    }

    @Test
    public void testToString() {
        String esperado = "mutequack{}";
        String obtenido = mq.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}