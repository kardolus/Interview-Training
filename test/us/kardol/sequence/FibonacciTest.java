package us.kardol.sequence;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by gkardol on 5/25/16.
 */
public class FibonacciTest {
    private Fibonacci fibonacci;
    private int[] sample = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};

    @Before
    public void setUp(){
        fibonacci = new Fibonacci(10);
    }

    @Test
    public void testFibonacci(){
        assertArrayEquals(sample, fibonacci.sequence());
    }
}