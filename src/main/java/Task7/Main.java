package Task7;

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade(new SubSystem0(), new SubSystem1(), new SubSystem2());
        facade.Operation0();
        facade.Operation1();
        facade.Operation2();

        Composite composite = new Composite("first");
        composite.Add(new Composite("second"));
        composite.Add(new Composite("third"));
        Composite composite3 = new Composite("fourth");
        composite.Add(composite3);
        composite3.Add(new EndComposite("endComposite"));
        composite.Display();
    }
}
