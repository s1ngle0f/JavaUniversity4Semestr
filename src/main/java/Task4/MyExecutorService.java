package Task4;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class MyExecutorService extends ThreadPoolExecutor {

    public MyExecutorService(int corePoolSize) {
        super(corePoolSize, corePoolSize, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());
    }

}
