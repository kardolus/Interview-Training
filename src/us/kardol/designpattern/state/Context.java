package us.kardol.designpattern.state;

public class Context {
    public Context(State state){
        this.state = state;
    }

    private State state;

    public void request(){
        state.handle();
    }
}
