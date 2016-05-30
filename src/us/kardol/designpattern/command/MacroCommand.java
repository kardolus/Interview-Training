package us.kardol.designpattern.command;

import java.util.List;

/**
 * Created by gkardol on 5/30/16.
 */
public class MacroCommand implements Command {
    private List<Command> commands;

    public MacroCommand(List<Command> commands){
        this.commands = commands;
    }

    @Override
    public void execute() {
        commands.forEach(Command::execute);
    }
}
