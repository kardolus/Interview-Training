package us.kardol.designpattern.command;

/**
 * Created by gkardol on 5/30/16.
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void invokeCommand(){
        command.execute();
    }
}
