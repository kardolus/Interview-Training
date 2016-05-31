package us.kardol.designpattern.adapter;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class AdapterTest {
    @Mock
    private Adaptee adaptee;

    private Adapter adapter;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        adapter = new Adapter(adaptee);
    }

    @Test
    public void testAdapter(){
        adapter.targetMethod();
        verify(adaptee, times(1)).adapteeMethod();
    }
}