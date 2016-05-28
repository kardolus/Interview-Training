package us.kardol.designpattern.decorator;

public abstract class Content {
    public abstract String methodA();
    public abstract String methodB();

    public String genericMethodA(){
        return "Generic Method A";
    }
    public String genericMethodB(){
        return "Generic Method B";
    }
}
