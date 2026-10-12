// Q6: Thread.sleep() - one thread sleeps, another continues
public class Q06_ThreadSleep {
    public static void main(String[] args) {
        Thread sleeper = new Thread(() -> {
            System.out.println("Sleeper: going to sleep for 2 seconds...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Sleeper interrupted");
            }
            System.out.println("Sleeper: woke up!");
        }, "Sleeper");

        Thread worker = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Worker: working " + i);
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) { }
            }
        }, "Worker");

        sleeper.start();
        worker.start();

        /* Explanation: sleep() pauses ONLY the thread that calls it (it goes to
           TIMED_WAITING and releases the CPU, but not any locks it holds). The other
           thread keeps running meanwhile. */
    }
}
