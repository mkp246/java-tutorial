package core.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class SimpleThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i =0; i<10;i++){
            executorService.execute(new Thread(new WorkerThread(""+i),"t"+i));
        }
        executorService.shutdown();
        while (!executorService.isTerminated()){
        }
        System.out.println("finished threads");
    }
}
