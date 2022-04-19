package Task7;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{
    List<Component> components = new ArrayList<>();
    public Composite(String name) {
        super(name);
    }

    @Override
    public void Display() {
        System.out.print(this.name + "\t");
        for (Component component : components) {
            component.Display();
        }
    }

    @Override
    public void Add(Component component) {
        components.add(component);
    }

    @Override
    public void Remove(Component component) {
        components.remove(component);
    }
}
