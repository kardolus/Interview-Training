package us.kardol.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observer> observerList = new ArrayList<>();

    public void notifyObservers(){
        observerList.forEach(Observer::update);
    }

    public void attach(Observer observer){
        observerList.add(observer);
    }

    public void detach(Observer observer){
        observerList.remove(observer);
    }

    public abstract int getState();
    public abstract void setState(int state);
}
