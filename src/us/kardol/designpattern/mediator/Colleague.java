package us.kardol.designpattern.mediator;

public abstract class Colleague {
    protected Mediator mediator;
    Colleague(Mediator mediator){
        this.mediator = mediator;
    }
    public abstract String operation();
    public abstract String displayValue();
}
