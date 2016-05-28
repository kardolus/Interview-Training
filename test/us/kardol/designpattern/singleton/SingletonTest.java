package us.kardol.designpattern.singleton;

import org.junit.Test;
import us.kardol.designpattern.singleton.Singleton;

import static org.junit.Assert.*;

public class SingletonTest {
    @Test
    public void testSingleton(){
        Singleton.getInstance().setSingletonData(Singleton.getInstance().getSingletonData() + "a");
        Singleton.getInstance().setSingletonData(Singleton.getInstance().getSingletonData() + "b");
        Singleton.getInstance().setSingletonData(Singleton.getInstance().getSingletonData() + "c");
        Singleton singleton = Singleton.getInstance();
        assertEquals(singleton.getValue(), 1);

        singleton.setSingletonData(Singleton.getInstance().getSingletonData() + "d");
        assertEquals(singleton.getSingletonData(), "abcd");
    }
}