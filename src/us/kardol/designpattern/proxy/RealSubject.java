package us.kardol.designpattern.proxy;

public class RealSubject implements Subject {
    @Override
    public String requestA() {
        return "RealSubjectA";
    }

    @Override
    public String requestB() {
        return "RealSubjectB";
    }

    @Override
    public String requestC() {
        return "RealSubjectC";
    }
}
