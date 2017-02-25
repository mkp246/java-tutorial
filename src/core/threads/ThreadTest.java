package core.threads;

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new HeavyWorkRunnable(), "t1");
        Thread t2 = new Thread(new HeavyWorkRunnable(), "t2");
        System.out.println("starting threads");
        t1.start();
        t2.start();
        System.out.println("started threads");
        Thread t3 = new MyThreads("t3");
        Thread t4 = new MyThreads("t4");
        t3.start();
        t4.start();
        System.out.println("my threads started");

        Thread t5 = new Thread(new HeavyWorkRunnable(), "t5");
        Thread t6 = new Thread(new HeavyWorkRunnable(), "t6");
        Thread t7 = new Thread(new HeavyWorkRunnable(), "t7");

        t5.start();
        t5.join(1200);
        t6.start();
        try{
            t5.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        t7.start();
        System.out.println("all thread gone, exit main");
    }
}
