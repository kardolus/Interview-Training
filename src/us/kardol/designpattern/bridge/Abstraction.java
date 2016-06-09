package us.kardol.designpattern.bridge;

public abstract class Abstraction {
    protected Implementor implementor;
    public Abstraction(Implementor implementor){
        this.implementor = implementor;
    }
    public abstract String operation();
}
