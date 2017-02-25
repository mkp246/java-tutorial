package core.threads;

public class HeavyWorkRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("doing heavy processing start " + Thread.currentThread().getName());
        try {
            Thread.sleep(500);
            doProcessing();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("doing heavy processing end " + Thread.currentThread().getName());
    }

    public void doProcessing() throws InterruptedException {
        Thread.sleep(1500);
    }
}