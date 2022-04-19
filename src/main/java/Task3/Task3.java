package Task3;
import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Task3 {
    static Set<Integer> hashSet = Collections.synchronizedSet(new HashSet<>());
    static List<Integer> list = Collections.synchronizedList(new ArrayList<>());
    private static final Lock lock = new ReentrantLock();

    synchronized static void addElementToHashSet(){
        hashSet.add(hashSet.size());
    }

    synchronized static void addElementToArrayList(){
        lock.lock();
        list.add(list.size());
        lock.unlock();
    }

    public static void main(String[] args) throws InterruptedException {
        Thread one = new Thread(()->{
            for (int i = 0; i < 5000; i++) {
                addElementToHashSet();
            }
        });
        Thread two = new Thread(()->{
            for (int i = 0; i < 5000; i++) {
                addElementToArrayList();
            }
        });
        one.start();
        two.start();
        Thread.sleep(10);
        System.out.println(hashSet.size());
        System.out.println(list.size());
    }
}
