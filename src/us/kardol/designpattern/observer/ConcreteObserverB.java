package us.kardol.designpattern.observer;

import us.kardol.designpattern.command.ConcreteCommandB;

/**
 * Created by gkardol on 5/30/16.
 */
public class ConcreteObserverB implements Observer {
    private Subject subject;
    private int subjectState;

    public ConcreteObserverB(Subject subject){
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println("Updated Observer B");
        this.subjectState = subject.getState();
    }

    public int getSubjectState() {
        return subjectState;
    }
}
