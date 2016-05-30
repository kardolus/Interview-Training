package us.kardol.designpattern.command;

import java.util.ArrayList;
import java.util.List;

public class Client { // would normally write a test class instead. Here for clarity
    private ReceiverA receiverA = new ReceiverA();
    private ReceiverB receiverB = new ReceiverB();
    private Command commandA = new ConcreteCommandA(receiverA);
    private Command commandB = new ConcreteCommandB(receiverB);
    private Invoker invoker = new Invoker();

    public void askInvokerToExecuteCommandA(){
        invoker.setCommand(commandA);
        invoker.invokeCommand();
    }

    public void askInvokerToExecuteCommandB(){
        invoker.setCommand(commandB);
        invoker.invokeCommand();
    }

    public void askInvokerToExecuteMacroCommand(){
        List<Command> commands = new ArrayList<>();
        Command command;

        commands.add(commandA);
        commands.add(commandB);
        command = new MacroCommand(commands);

        invoker.setCommand(command);
        invoker.invokeCommand();
    }

    public void invokeLambdaCommand(){
        invoker.setCommand(() -> receiverA.doOperation());
        invoker.invokeCommand();
    }
}
