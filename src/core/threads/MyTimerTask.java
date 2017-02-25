package core.threads;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class MyTimerTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("timer task created at " +  new Date());
        doTask();
        System.out.println("timer task completed at " +  new Date());
    }

    private void doTask() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        TimerTask timerTask = new MyTimerTask();
        Timer timer = new Timer(true);
        timer.scheduleAtFixedRate(timerTask, 0, 2500);
        System.out.println("timer task started");
        Thread.sleep(20000);
        timer.cancel();
        System.out.println("timer task cancelled");
        Thread.sleep(5000);
        System.out.println("main finished " + new Date());
    }
}
