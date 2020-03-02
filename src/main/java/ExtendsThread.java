public class ExtendsThread extends Thread {

    private Counter counter;

    public ExtendsThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        while (counter.getCount() < 100) {
            counter.increment();
            System.out.println("Thread 1:" + counter.getCount());
        }
    }
}
