package us.kardol.designpattern.bridge;

public class ConcreteImplementorA implements Implementor {
    @Override
    public String operationImpl() {
        return this.getClass().getSimpleName().toString();
    }
}
