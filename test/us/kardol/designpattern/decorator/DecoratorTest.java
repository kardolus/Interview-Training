package us.kardol.designpattern.decorator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by gkardol on 5/26/16.
 */
public class DecoratorTest {
    private Content content;

    @Before
    public void setUp(){
        content = new ConcreteContent();
    }

    @Test
    public void testDecoratorPattern(){
        assertEquals(content.methodA(), "Concrete Method A");
        assertEquals(new ConcreteDacoratorA(content).methodA(), "Concrete Method A and ConcreteDecoratorA");
        assertEquals(new ConcreteDecoratorB(new ConcreteDacoratorA(content)).methodA(),
                "Concrete Method A and ConcreteDecoratorA and ConcreteDecoratorB");
    }
}