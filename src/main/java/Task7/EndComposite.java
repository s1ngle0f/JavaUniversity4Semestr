package Task7;

public class EndComposite extends Component{
    public EndComposite(String name) {
        super(name);
    }

    @Override
    public void Display() {
        System.out.print(this.name);
    }

    @Override
    public void Add(Component component) throws Exception {
        throw new Exception();
    }

    @Override
    public void Remove(Component component) throws Exception {
        throw new Exception();
    }
}
