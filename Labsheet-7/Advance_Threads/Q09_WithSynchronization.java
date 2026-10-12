// Q9: Shared counter WITH synchronization - correct result
class SyncCounter {
    private int count = 0;

    synchronized void increment() {      // only one thread at a time can run this method
        int temp = count;
        Thread.yield();
        count = temp + 1;
    }

    int getCount() {
        return count;
    }
}

public class Q09_WithSynchronization {
    public static void main(String[] args) throws InterruptedException {
        SyncCounter counter = new SyncCounter();

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
        System.out.println("Actual count   = " + counter.getCount());
    }
}
