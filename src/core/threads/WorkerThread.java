package core.threads;

public class WorkerThread implements Runnable {
    private String command;

    public WorkerThread(String command) {
        this.command = command;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " start command " + command);
        processCommand();
        System.out.println(Thread.currentThread().getName() + " end command " + command);
    }

    private void processCommand() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
