package core.threads;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    private BlockingQueue<Message> messages;

    public Producer(BlockingQueue<Message> messages) {
        this.messages = messages;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            Message newMessage = new Message("" + i);
            try {
                messages.put(newMessage);
                Thread.sleep(i);
                System.out.println("produced " + newMessage.getMessage());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Message msg = new Message("exit");
        try {
            messages.put(msg);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
