// Q4: Two threads running simultaneously, printing their own names
public class Q04_TwoThreadsScheduling {
    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " : iteration " + i);
            }
        };

        Thread t1 = new Thread(task, "Thread-A");
        Thread t2 = new Thread(task, "Thread-B");
        t1.start();
        t2.start();

        /* Observation / thread scheduling:
           The output of Thread-A and Thread-B usually interleaves, and the order can
           change on every run. The JVM hands scheduling to the OS thread scheduler
           (time-slicing / pre-emptive), so the programmer cannot control which
           thread runs first or for how long. */
    }
}
