package us.kardol.designpattern.strategy;

/**
 * Created by gkardol on 5/25/16.
 */
public class StrategyImplOne implements Strategy {
    @Override
    public void doOperation() {
        System.out.println("One");
    }
}
