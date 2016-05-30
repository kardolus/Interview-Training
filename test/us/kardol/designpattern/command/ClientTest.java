package us.kardol.designpattern.command;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ClientTest {
    private Client client;
    private ByteArrayOutputStream outContent;

    @Before
    public void setUp() throws Exception {
        client = new Client();
        outContent  = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUp() throws Exception{
        System.setOut(null);
    }

    @Test
    public void askInvokerToExecuteCommandA() throws Exception {
        client.askInvokerToExecuteCommandA();
        assertEquals(outContent.toString(), "Operation A\n");
    }

    @Test
    public void askInvokerToExecuteCommandB() throws Exception {
        client.askInvokerToExecuteCommandB();
        assertEquals(outContent.toString(), "Action B\n");
    }

    @Test
    public void askInvokerToExecuteMacroCommand() throws Exception {
        client.askInvokerToExecuteMacroCommand();
        assertEquals(outContent.toString(), "Operation A\nAction B\n");
    }

    @Test
    public void invokeLambdaCommand() throws Exception {
        client.invokeLambdaCommand();
        assertEquals(outContent.toString(), "Operation A\n");
    }

    @Test
    public void invokeMethodReferenceCommand() throws Exception {
        client.invokeMethodReferenceCommand();
        assertEquals(outContent.toString(), "Action B\n");
    }
}