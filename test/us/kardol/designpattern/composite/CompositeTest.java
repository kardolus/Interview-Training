package us.kardol.designpattern.composite;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.times;

public class CompositeTest {
    @Mock
    private Component leafA;

    @Mock
    private Component leafB;

    private Component composite;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        this.composite = new Composite();
    }

    @Test
    public void testCompositePattern(){
        leafA.operation();
        leafB.operation();
        composite.add(leafA);
        composite.add(leafB);
        composite.operation();

        Mockito.verify(leafA, times(2)).operation();
        Mockito.verify(leafB, times(2)).operation();
    }
}