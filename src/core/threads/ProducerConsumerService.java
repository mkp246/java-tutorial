package core.threads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerService {
    public static void main(String[] args) {
        BlockingQueue<Message> messages = new ArrayBlockingQueue<Message>(8);

        Producer producer = new Producer(messages);
        Consumer consumer = new Consumer(messages);

        new Thread(producer).start();
        new Thread(producer).start();
        new Thread(producer).start();
        new Thread(consumer).start();
        System.out.println("all thread started");
    }
}
