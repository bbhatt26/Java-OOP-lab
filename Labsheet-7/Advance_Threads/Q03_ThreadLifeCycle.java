// Q3: Thread life cycle - NEW, RUNNABLE, BLOCKED, TIMED_WAITING, TERMINATED
//
// NEW           : thread object created, start() not yet called
// RUNNABLE      : after start(); ready to run / running (Java combines "Ready" and "Running")
// BLOCKED       : waiting to acquire a monitor lock held by another thread
// WAITING /
// TIMED_WAITING : waiting (e.g. sleep(ms), join(), wait())
// TERMINATED    : run() has finished
public class Q03_ThreadLifeCycle {
    static final Object lock = new Object();
    static volatile boolean go = false;      // lets us keep the thread RUNNABLE until we are ready

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            while (!go) { }                          // busy-wait -> RUNNABLE
            synchronized (lock) {                    // needs the lock -> may get BLOCKED
                try {
                    Thread.sleep(500);               // TIMED_WAITING
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        System.out.println("1. After creating thread      : " + t.getState());   // NEW

        synchronized (lock) {                        // main holds the lock
            t.start();
            System.out.println("2. After start()              : " + t.getState());   // RUNNABLE
            go = true;                               // now let the thread try to take the lock
            Thread.sleep(200);
            System.out.println("3. Waiting for lock held by main: " + t.getState()); // BLOCKED
        }                                            // main releases lock here

        Thread.sleep(200);
        System.out.println("4. Thread inside sleep(500)    : " + t.getState());   // TIMED_WAITING

        t.join();                                    // wait for t to finish
        System.out.println("5. After run() completes      : " + t.getState());   // TERMINATED
    }
}
