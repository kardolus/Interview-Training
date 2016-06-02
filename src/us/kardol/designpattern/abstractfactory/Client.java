package us.kardol.designpattern.abstractfactory;

/**
 * Created by gkardol on 6/2/16.
 */
public class Client {
    private AbstractFactory factory;

    public Client(AbstractFactory factory){
        this.factory = factory;
    }

    public String runFactoryMethodA(){
        return factory.createProductA().methodA();
    }
    public String runFactoryMethodB(){
        return factory.createProductB().methodB();
    }
}
