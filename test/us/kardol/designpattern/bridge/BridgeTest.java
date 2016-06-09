package us.kardol.designpattern.bridge;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BridgeTest {
    private Abstraction abstraction;

    @Before
    public void setUp(){
        abstraction = new RefinedAbstraction(new ConcreteImplementorA());
    }

    @Test
    public void testBridge(){
        assertEquals("ConcreteImplementorA", abstraction.operation());
    }
}