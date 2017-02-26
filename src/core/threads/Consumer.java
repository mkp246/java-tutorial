package core.threads;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    private BlockingQueue<Message> messages;

    public Consumer(BlockingQueue<Message> messages) {
        this.messages = messages;
    }

    @Override
    public void run() {
        Message message;
        try {
            while (!(message = messages.take()).getMessage().equals("exit")) {
                Thread.sleep(20);
                System.out.println("consumed " + message.getMessage());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
