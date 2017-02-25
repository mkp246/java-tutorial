package core.threads;

import java.util.ArrayList;

public class MultiThreadTest {
    public static void main(String[] args) throws InterruptedException {
        ProcessingThread processingThread = new ProcessingThread();
        Thread t1 = new Thread(processingThread, "t1");
        t1.start();
        Thread t2 = new Thread(processingThread, "t2");
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Processing count " + processingThread.getCount());
    }
}

class ProcessingThread implements Runnable {
    private int count;
    private Object mutex = new Object();

    public int getCount() {
        return count;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                processSomething(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (mutex) {
                count++;
            }
        }
    }

    private void processSomething(int i) throws InterruptedException {
        Thread.sleep(i * 200);
    }
}
