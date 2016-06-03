package us.kardol.designpattern.state;

public class Context {
    public Context(State state){
        this.state = state;
    }

    private State state;

    public void setState(State state){ // can call this from a concrete state for example.
        this.state = state;
    }

    public void request(){
        state.handle();
    }
}
