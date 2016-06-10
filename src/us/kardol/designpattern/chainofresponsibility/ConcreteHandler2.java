package us.kardol.designpattern.chainofresponsibility;

public class ConcreteHandler2 extends Handler {
    @Override
    public String handleRequest(String message) {
        return "handler2";
    }
}
