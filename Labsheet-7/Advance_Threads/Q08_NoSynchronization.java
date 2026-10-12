// Q8: Shared counter WITHOUT synchronization - incorrect (race condition)
class Counter {
    int count = 0;

    void increment() {
        int temp = count;        // read
        Thread.yield();          // let another thread run in between (makes the race easy to see)
        count = temp + 1;        // write  -> read/modify/write is NOT atomic
    }
}

public class Q08_NoSynchronization {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Runnable task = () -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();

        System.out.println("Expected count = 30000");
        System.out.println("Actual count   = " + counter.count + "   (usually less -> race condition)");
    }
}
