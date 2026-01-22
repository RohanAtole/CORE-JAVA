import java.util.*;

class Buffer {
    private Queue<Integer> queue = new LinkedList<>();
    private final int LIMIT = 5;

    public synchronized void produce(int value) throws InterruptedException {
        while (queue.size() == LIMIT) wait();
        queue.add(value);
        System.out.println("Produced: " + value);
        notify();
    }

    public synchronized void consume() throws InterruptedException {
        while (queue.isEmpty()) wait();
        int val = queue.poll();
        System.out.println("Consumed: " + val);
        notify();
    }
}

public class ProducerConsumer {

    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        Thread producer = new Thread(() -> {
            int i = 1;
            while (true) {
                try {
                    buffer.produce(i++);
                    Thread.sleep(500);
                } catch (Exception e) {}
            }
        });

        Thread consumer = new Thread(() -> {
            while (true) {
                try {
                    buffer.consume();
                    Thread.sleep(800);
                } catch (Exception e) {}
            }
        });

        producer.start();
        consumer.start();
    }
}
