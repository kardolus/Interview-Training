package us.kardol.designpattern.templatemethod;

public abstract class AbstractClass {
    public final void templateMethod(){
        primativeOperation1();
        primativeOperation2();
    }
    public abstract void primativeOperation1();
    public abstract void primativeOperation2();
}
