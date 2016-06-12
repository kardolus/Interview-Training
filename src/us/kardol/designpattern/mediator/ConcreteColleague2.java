package us.kardol.designpattern.mediator;

public class ConcreteColleague2 extends Colleague {
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public String operation() {
        return "Colleague2";
    }

    @Override
    public String displayValue() {
        return "Value2";
    }

}
