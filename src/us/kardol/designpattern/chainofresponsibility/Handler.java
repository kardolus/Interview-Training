package us.kardol.designpattern.chainofresponsibility;

public abstract class Handler {
    protected Handler successor; // optional in this pattern.
    public abstract String handleRequest(String message);
    public void setSuccessor(Handler handler){
        this.successor = handler;
    }
}
