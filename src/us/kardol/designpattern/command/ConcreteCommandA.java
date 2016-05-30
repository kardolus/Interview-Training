package us.kardol.designpattern.command;

/**
 * Created by gkardol on 5/30/16.
 */
public class ConcreteCommandA implements Command {
    private ReceiverA receiverA;

    public ConcreteCommandA(ReceiverA receiverA){
        this.receiverA = receiverA;
    }

    @Override
    public void execute() {
        receiverA.doOperation();
    }
}
