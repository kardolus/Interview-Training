package us.kardol.designpattern.strategy;

/**
 * Created by gkardol on 5/25/16.
 */
public class Context {
    Strategy strategy;
    public Context(Strategy strategy){
        this.strategy = strategy;
    }


    public void executeStrategy() {
        strategy.doOperation();
    }
}
