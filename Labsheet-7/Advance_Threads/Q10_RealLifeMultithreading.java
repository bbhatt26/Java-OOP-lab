// Q10: Real-life example - downloading files in parallel, then processing them
//
// Thread roles:
//   Downloader-1/2/3 : each downloads one file at the same time (parallel work)
//   Processor        : starts only after all downloads are complete (waits using join())
//   main thread      : creates and starts the other threads, then waits for them
class Downloader extends Thread {
    private String fileName;
    private int sizeMB;

    Downloader(String name, String fileName, int sizeMB) {
        super(name);
        this.fileName = fileName;
        this.sizeMB = sizeMB;
    }

    @Override
    public void run() {
        System.out.println(getName() + ": started downloading " + fileName);
        for (int mb = 1; mb <= sizeMB; mb++) {
            try { Thread.sleep(200); } catch (InterruptedException e) { }
            System.out.println(getName() + ": " + fileName + " " + (mb * 100 / sizeMB) + "%");
        }
        System.out.println(getName() + ": finished " + fileName);
    }
}

public class Q10_RealLifeMultithreading {
    public static void main(String[] args) throws InterruptedException {
        Thread d1 = new Downloader("Downloader-1", "video.mp4", 5);
        Thread d2 = new Downloader("Downloader-2", "photo.zip", 3);
        Thread d3 = new Downloader("Downloader-3", "notes.pdf", 2);

        d1.start();
        d2.start();
        d3.start();

        d1.join();
        d2.join();
        d3.join();

        Thread processor = new Thread(() -> {
            System.out.println("Processor: all downloads done, now processing files...");
            try { Thread.sleep(500); } catch (InterruptedException e) { }
            System.out.println("Processor: processing complete.");
        }, "Processor");
        processor.start();
        processor.join();

        System.out.println("main: all tasks finished.");
    }
}
