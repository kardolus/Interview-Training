package us.kardol.designpattern.chainofresponsibility;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HandlerTest {
    private Handler handler;

    @Before
    public void setUp(){
        this.handler = new ConcreteHandler1();
    }

    @Test
    public void testHandle(){
        assertEquals(handler.handleRequest("a"), "handler1");
    }

    @Test
    public void testPassOn(){
        assertEquals(handler.handleRequest(null), "handler2");
    }

}