package us.kardol.designpattern.observer;

/**
 * Created by gkardol on 5/30/16.
 */
public class ConcreteSubject extends Subject {
    private int state; // int for simplicity

    @Override
    public int getState() {
        return this.state;
    }

    @Override
    public void setState(int state) {
        if(this.state == state){
            return;
        }
        this.state = state;
        notifyObservers();
    }
}
