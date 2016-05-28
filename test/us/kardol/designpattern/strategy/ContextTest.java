package us.kardol.designpattern.strategy;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.times;

public class ContextTest {
    private Context contextOne, contextTwo, contextThree;

    @Mock
    private Strategy strategyOne;

    @Mock
    private Strategy strategyTwo;

    @Mock
    private Strategy strategyThree;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        contextOne = new Context(strategyOne);
        contextTwo = new Context(strategyTwo);
        contextThree = new Context(strategyThree);
    }

    @Test
    public void testExecuteStrategy(){
        contextOne.executeStrategy();
        contextTwo.executeStrategy();
        contextThree.executeStrategy();

        Mockito.verify(strategyOne, times(1)).doOperation();
        Mockito.verify(strategyTwo, times(1)).doOperation();
        Mockito.verify(strategyThree, times(1)).doOperation();
    }
}