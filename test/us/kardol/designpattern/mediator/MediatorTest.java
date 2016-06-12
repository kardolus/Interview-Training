package us.kardol.designpattern.mediator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MediatorTest {
    Mediator mediator;
    Colleague colleague;

    @Before
    public void setUp(){
        this.mediator = new ConcreteMediator();
        this.colleague = new ConcreteColleague1(mediator);
    }

    @Test
    public void testMediator(){
        assertEquals(colleague.operation(), "Colleague1 Value2");
    }
}