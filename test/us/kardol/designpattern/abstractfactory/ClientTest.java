package us.kardol.designpattern.abstractfactory;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by gkardol on 6/2/16.
 */
public class ClientTest {
    private ConcreteFactory1 concreteFactory1;
    private ConcreteFactory2 concreteFactory2;

    private Client client;

    @Test
    public void testFactory1(){
        concreteFactory1 = new ConcreteFactory1();
        client = new Client(concreteFactory1);
        assertEquals(client.runFactoryMethodA(), "A1");
        assertEquals(client.runFactoryMethodB(), "B1");
    }

    @Test
    public void testFactory2(){
        concreteFactory2 = new ConcreteFactory2();
        client = new Client(concreteFactory2);
        assertEquals(client.runFactoryMethodA(), "A2");
        assertEquals(client.runFactoryMethodB(), "B2");
    }

}