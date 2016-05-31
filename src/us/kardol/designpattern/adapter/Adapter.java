package us.kardol.designpattern.adapter;

public class Adapter implements TargetInterface {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void targetMethod() {
        adaptee.adapteeMethod();
    }
}
