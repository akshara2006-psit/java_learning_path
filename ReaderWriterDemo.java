import java.util.concurrent.Semaphore;

class ReaderWriter {
    private int readCount = 0;

    Semaphore mutex = new Semaphore(1);
    Semaphore writeLock = new Semaphore(1);

    public void startReading(int id) throws InterruptedException {
        mutex.acquire();
        readCount++;
        if (readCount == 1) {
            writeLock.acquire();
        }
        mutex.release();

        System.out.println("Reader " + id + " is reading");

        Thread.sleep(500);

        mutex.acquire();
        readCount--;
        if (readCount == 0) {
            writeLock.release();
        }
        mutex.release();
    }

    public void startWriting(int id) throws InterruptedException {
        writeLock.acquire();

        System.out.println("Writer " + id + " is writing");

        Thread.sleep(700);

        writeLock.release();
    }
}

class Reader extends Thread {
    ReaderWriter rw;
    int id;

    public Reader(ReaderWriter rw, int id) {
        this.rw = rw;
        this.id = id;
    }

    public void run() {
        try {
            rw.startReading(id);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Writer extends Thread {
    ReaderWriter rw;
    int id;

    public Writer(ReaderWriter rw, int id) {
        this.rw = rw;
        this.id = id;
    }

    public void run() {
        try {
            rw.startWriting(id);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ReaderWriterDemo {
    public static void main(String[] args) {
        System.out.println("Akshara Gupta\n 2401640100125\n CS2A");
        ReaderWriter rw = new ReaderWriter();

        Reader r1 = new Reader(rw, 1);
        Reader r2 = new Reader(rw, 2);
        Writer w1 = new Writer(rw, 1);

        r1.start();
        r2.start();
        w1.start();
    }
}