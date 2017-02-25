package core.threads;

import java.util.Date;

public class DaemonThreadTest {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new DaemonThread(), "dt");
        thread.setDaemon(true);
        thread.start();
        Thread.sleep(10000);
        System.out.println("finishe main");
    }
}

class DaemonThread implements Runnable {

    @Override
    public void run() {
        while (true) {
            doProcessing();
        }
    }

    private void doProcessing() {
        try {
            System.out.println("processing deamon thread");
            System.out.println(new Date());
            System.out.println(Thread.currentThread().isDaemon());
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
