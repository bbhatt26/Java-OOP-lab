// Q7: join() - one thread waits for another to finish
public class Q07_ThreadJoin {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread-1 working: " + i);
                try { Thread.sleep(300); } catch (InterruptedException e) { }
            }
            System.out.println("Thread-1 finished.");
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            try {
                System.out.println("Thread-2 waiting for Thread-1 to finish...");
                t1.join();                       // waits until t1 terminates
            } catch (InterruptedException e) { }
            System.out.println("Thread-2 resumed after Thread-1 completed.");
        }, "Thread-2");

        t1.start();
        t2.start();
    }
}
