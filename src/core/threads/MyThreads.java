package core.threads;

public class MyThreads extends Thread{
    public MyThreads(String t3) {
        super(t3);
    }

    @Override
    public void run(){
        System.out.println("My thread start " + Thread.currentThread().getName());
        try {
            Thread.sleep(500);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("my thread end " + Thread.currentThread().getName());
    }
}
