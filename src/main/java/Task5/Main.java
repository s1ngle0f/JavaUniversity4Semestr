package Task5;

public class Main {
    public static void main(String[] args) {
        Singleton0 singleton0 = new Singleton0();
        System.out.println(singleton0.getInstance());
        singleton0 = new Singleton0();
        System.out.println(singleton0.getInstance());

        Singleton1 singleton1 = new Singleton1();
        System.out.println(singleton1.getInstance());
        singleton1 = new Singleton1();
        System.out.println(singleton1.getInstance());

        System.out.println(Singleton2.INSTANCE);
    }
}
