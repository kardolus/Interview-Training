package us.kardol.designpattern.chainofresponsibility;

public class ConcreteHandler1 extends Handler {
    @Override
    public String handleRequest(String message) {
        setSuccessor(new ConcreteHandler2());

        if(message != null){
            return "handler1";
        }
        else{
            return successor.handleRequest("a");
        }
    }
}
