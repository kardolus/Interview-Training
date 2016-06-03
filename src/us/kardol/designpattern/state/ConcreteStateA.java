package us.kardol.designpattern.state;

public class ConcreteStateA implements State {
    private Context context;

    public ConcreteStateA(Context context){
        // in order to change state
        this.context = context;
    }

    @Override
    public void handle() {
        // do some stuff and optionally, change state:
        context.setState(this);
    }
}
