// Q1: Create a thread by extending the Thread class
class MessageThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + ". Hello from thread: " + getName());
        }
    }
}

public class Q01_ThreadClass {
    public static void main(String[] args) {
        MessageThread t = new MessageThread();
        t.start();       // start() creates a new thread and calls run()
    }
}
