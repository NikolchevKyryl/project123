package test;

import static org.junit.Assert.assertEquals;

import main.Fib;
import org.junit.Before;
import org.junit.Test;

public class FibTest {
    private Fib fib;

    @Before
    public void setUp() {
        fib = new Fib();
    }

    @Test
    public void calculate_0() {
        int testIndex = 0;
        int expectedResult = 1;

        assertEquals(expectedResult, fib.calculate(testIndex));
    }
}
