package us.kardol.designpattern.templatemethod;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.times;

public class TemplateMethodTest {
    @Mock
    ConcreteClass concreteClass;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testTemplate(){
        concreteClass.templateMethod();
        Mockito.verify(concreteClass, times(1)).primativeOperation1();
        Mockito.verify(concreteClass, times(1)).primativeOperation2();
    }
}