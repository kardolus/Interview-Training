package us.kardol.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    List<Component> componentList = new ArrayList<>();

    @Override
    public void add(Component component){
        componentList.add(component);
    }

    @Override
    public void remove(Component component){
        componentList.remove(component);
    }

    @Override
    public Component getChild(int n){
        return componentList.get(n);
    }

    @Override
    public void operation() {
        componentList.forEach(Component::operation);
    }
}
