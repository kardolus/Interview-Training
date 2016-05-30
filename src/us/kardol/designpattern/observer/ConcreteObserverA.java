package us.kardol.designpattern.observer;

/**
 * Created by gkardol on 5/30/16.
 */
public class ConcreteObserverA implements Observer {
    private Subject subject;
    private int subjectState;

    public ConcreteObserverA(Subject subject){
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println("Updated Observer A");
        this.subjectState = subject.getState();
    }

    public int getSubjectState() {
        return subjectState;
    }
}
