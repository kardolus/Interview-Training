package us.kardol.designpattern.decorator;

/**
 * Created by gkardol on 5/26/16.
 */
public class ConcreteDecoratorB extends Decorator{
    private Content content;

    public ConcreteDecoratorB(Content content){
        this.content = content;
    }

    @Override
    public String methodA() {
        return content.methodA() + " and ConcreteDecoratorB";
    }

    @Override
    public String methodB() {
        return content.methodB() + " and ConcreteDecoratorB";
    }

    @Override
    public String genericMethodA() {
        return "Generic Method from ConcreteDecoratorB";
    }
}
