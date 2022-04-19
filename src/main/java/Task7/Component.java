package Task7;

public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void Display();
    public abstract void Add(Component component) throws Exception;
    public abstract void Remove(Component component) throws Exception;
}
