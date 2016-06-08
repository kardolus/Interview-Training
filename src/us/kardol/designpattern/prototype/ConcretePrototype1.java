package us.kardol.designpattern.prototype;

public class ConcretePrototype1 implements Prototype, Cloneable {
    private String property;

    @Override
    public Prototype clone() {
        try {
            return (ConcretePrototype1) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String getProperty() {
        return property;
    }

    @Override
    public void setProperty(String property) {
        this.property = property;
    }
}
