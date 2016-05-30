package us.kardol.designpattern.command;

/**
 * Created by gkardol on 5/30/16.
 */
public class ConcreteCommandB implements Command {
    private ReceiverB receiverB;

    public ConcreteCommandB(ReceiverB receiverB){
        this.receiverB = receiverB;
    }

    @Override
    public void execute() {
        receiverB.doAction();
    }
}
