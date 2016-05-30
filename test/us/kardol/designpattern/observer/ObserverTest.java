package us.kardol.designpattern.observer;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by gkardol on 5/30/16.
 */
public class ObserverTest {
    Subject subject;
    ConcreteObserverA concreteObserverA;
    ConcreteObserverB concreteObserverB;

    @Before
    public void setUp(){
        subject = new ConcreteSubject();
        concreteObserverA = new ConcreteObserverA(subject);
        concreteObserverB = new ConcreteObserverB(subject);
        subject.attach(concreteObserverA);
        subject.attach(concreteObserverB);
    }

    @Test
    public void testStateChange(){
        subject.setState(5);
        assertEquals(concreteObserverA.getSubjectState(), 5);
        assertEquals(concreteObserverA.getSubjectState(), concreteObserverB.getSubjectState());
    }

    @Test
    public void testDetach(){
        subject.detach(concreteObserverB);
        subject.setState(5);
        assertNotEquals(concreteObserverA.getSubjectState(), concreteObserverB.getSubjectState());
    }

}