package core.threads;

public class NotifyWaitTest {
    public static void main(String[] args) {
        Message message = new Message("process it");
        Message message1 = new Message("process it too");
        Waiter waiter = new Waiter(message);
        new Thread(waiter, "waiter").start();
        Waiter waiter1 = new Waiter(message);
        new Thread(waiter1, "waiter1").start();
        Notifier notifier = new Notifier(message);
        new Thread(notifier, "notifier").start();
        System.out.println("all thread started");
    }
}
