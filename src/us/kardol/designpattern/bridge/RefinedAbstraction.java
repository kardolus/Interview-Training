package us.kardol.designpattern.bridge;

public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public String operation() {
        return implementor.operationImpl();
    }
}
