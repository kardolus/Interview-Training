package us.kardol.designpattern.decorator;

/**
 * Created by gkardol on 5/26/16.
 */
public class ConcreteDacoratorA extends Decorator {
    private Content content;

    public ConcreteDacoratorA(Content content){
        this.content = content;
    }

    @Override
    public String methodA() {
        return content.methodA() + " and ConcreteDecoratorA";
    }

    @Override
    public String methodB() {
        return content.methodB() + " and ConcreteDecoratorA";
    }

    @Override
    public String genericMethodA() {
        return "Generic Method from ConcreteDecoratorA";
    }
}
