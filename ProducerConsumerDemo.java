import java.util.concurrent.Semaphore;

class BoundedBuffer {
    private int[] buffer;
    private int size;
    private int in = 0, out = 0;

    Semaphore mutex = new Semaphore(1);
    Semaphore empty;
    Semaphore full;

    public BoundedBuffer(int size) {
        this.size = size;
        buffer = new int[size];
        empty = new Semaphore(size);
        full = new Semaphore(0);
    }

    public void produce(int item) throws InterruptedException {
        empty.acquire();
        mutex.acquire();

        buffer[in] = item;
        System.out.println("Produced: " + item);
        in = (in + 1) % size;

        mutex.release();
        full.release();
    }

    public void consume() throws InterruptedException {
        full.acquire();
        mutex.acquire();

        int item = buffer[out];
        System.out.println("Consumed: " + item);
        out = (out + 1) % size;

        mutex.release();
        empty.release();
    }
}

class Producer extends Thread {
    BoundedBuffer buffer;

    public Producer(BoundedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                buffer.produce(i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer extends Thread {
    BoundedBuffer buffer;

    public Consumer(BoundedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                buffer.consume();
                Thread.sleep(800);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        BoundedBuffer buffer = new BoundedBuffer(3);
        System.out.println("Akshara Gupta\n 2401640100125\n CS2A");
        Producer p = new Producer(buffer);
        Consumer c = new Consumer(buffer);

        p.start();
        c.start();
    }
}