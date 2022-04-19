package Task7;

public class Facade {
    private SubSystem0 subSystem0;
    private SubSystem1 subSystem1;
    private SubSystem2 subSystem2;

    public Facade(SubSystem0 subSystem0, SubSystem1 subSystem1, SubSystem2 subSystem2) {
        this.subSystem0 = subSystem0;
        this.subSystem1 = subSystem1;
        this.subSystem2 = subSystem2;
    }

    public void Operation0(){
        subSystem0.MakeSomething();
        subSystem1.MakeSomething();
    }

    public void Operation1(){
        subSystem1.MakeSomething();
        subSystem2.MakeSomething();
    }

    public void Operation2(){
        subSystem0.MakeSomething();
        subSystem2.MakeSomething();
    }
}
