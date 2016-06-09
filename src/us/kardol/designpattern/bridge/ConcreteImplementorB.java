package us.kardol.designpattern.bridge;

public class ConcreteImplementorB implements Implementor {
    @Override
    public String operationImpl() {
        return this.getClass().getSimpleName().toString();
    }
}
