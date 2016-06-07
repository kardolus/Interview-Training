package us.kardol.designpattern.proxy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProxyTest {
    Subject proxy;

    @Before
    public void setUp(){
        proxy = new Proxy();
    }

    @Test
    public void testRealProxy(){
        assertEquals(proxy.requestA(), "RealSubjectA");
        assertEquals(proxy.requestB(), "RealSubjectB");
    }

    @Test
    public void testCachedResponse(){
        assertEquals(proxy.requestB(), "ProxyB");
    }

    @Test
    public void testDestroyRealSubject(){
        proxy.requestA();
        proxy.requestC();
        assertEquals(proxy.requestB(), "ProxyB");
    }
}