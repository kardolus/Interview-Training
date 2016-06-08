package us.kardol.designpattern.prototype;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrototypeTest {
    private Prototype prototype1;
    private Prototype prototype2;

    @Before
    public void setUp(){
        prototype1 = new ConcretePrototype1();
        prototype2 = new ConcretePrototype2();
    }

    @Test
    public void testClone(){
        prototype2.setProperty("value1");
        assertEquals(prototype2.getProperty(), prototype2.clone().getProperty());
        assertNotEquals(prototype2, prototype2.clone());
    }
}