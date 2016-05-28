package us.kardol.designpattern.decorator;

/**
 * Created by gkardol on 5/26/16.
 */
public class ConcreteContent extends Content {
    @Override
    public String methodA() {
        return "Concrete Method A";
    }

    @Override
    public String methodB() {
        return "Concrete Method B";
    }
}
