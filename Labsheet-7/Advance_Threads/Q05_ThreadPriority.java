// Q5: Thread priorities
class PriorityThread extends Thread {
    PriorityThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " (priority " + getPriority() + ") running, step " + i);
        }
    }
}

public class Q05_ThreadPriority {
    public static void main(String[] args) {
        PriorityThread low  = new PriorityThread("Low-Thread");
        PriorityThread norm = new PriorityThread("Normal-Thread");
        PriorityThread high = new PriorityThread("High-Thread");

        low.setPriority(Thread.MIN_PRIORITY);     // 1
        norm.setPriority(Thread.NORM_PRIORITY);   // 5
        high.setPriority(Thread.MAX_PRIORITY);    // 10

        low.start();
        norm.start();
        high.start();

        /* Priority is only a HINT to the scheduler. A higher-priority thread is more
           likely to run first, but it is not guaranteed; results depend on the OS/JVM. */
    }
}
