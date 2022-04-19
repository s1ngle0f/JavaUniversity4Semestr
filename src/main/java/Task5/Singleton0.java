package Task5;

public class Singleton0 {
    private static Singleton0 instance;
    public synchronized Singleton0 getInstance() {
        if(instance == null) {
            instance = new Singleton0();
            return instance;
        }
        return instance;
    }
}

