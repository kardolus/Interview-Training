package us.kardol.designpattern.mediator;

public class ConcreteMediator implements Mediator {
    private Colleague colleague1 = new ConcreteColleague1(this);
    private Colleague colleague2 = new ConcreteColleague2(this);

    @Override
    public String colleagueChanged(Colleague colleague) {
        if(colleague instanceof ConcreteColleague1){
            return colleague2.displayValue();
        }
        return colleague1.displayValue();
    }
}
