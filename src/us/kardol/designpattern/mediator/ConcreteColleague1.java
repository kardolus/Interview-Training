package us.kardol.designpattern.mediator;

public class ConcreteColleague1 extends Colleague {
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public String operation() {
        return "Colleague1 " + mediator.colleagueChanged(this);
    }

    @Override
    public String displayValue() {
        return "Value1";
    }
}
