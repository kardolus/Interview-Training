package us.kardol.designpattern.state;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.times;

public class StateTest {
    @Mock
    private ConcreteStateA concreteStateA;

    @Mock
    private ConcreteStateB concreteStateB;

    private Context context;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testStateA(){
        context = new Context(concreteStateA);
        context.request();
        Mockito.verify(concreteStateA, times(1)).handle();
    }

    @Test
    public void testStateB(){
        context = new Context(concreteStateB);
        context.request();
        Mockito.verify(concreteStateB, times(1)).handle();
    }
}