// Q2: Create a thread by implementing Runnable - print 1 to 10
class NumberTask implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " -> " + i);
        }
    }
}

public class Q02_RunnableInterface {
    public static void main(String[] args) {
        Thread t = new Thread(new NumberTask(), "NumberThread");
        t.start();
    }
}
