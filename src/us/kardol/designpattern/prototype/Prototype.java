package us.kardol.designpattern.prototype;

public interface Prototype {
    Prototype clone();
    String getProperty();
    void setProperty(String property);
}
