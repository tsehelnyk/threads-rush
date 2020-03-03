public class ExtendsThread extends Thread {
    private int iterations;
    private Counter counter;

    public ExtendsThread(Counter counter, int iterations) {
        this.counter = counter;
        this.iterations = iterations;
    }

    public void run() {
        while (counter.getCount() < iterations) {
            counter.increment();
            System.out.println("Thread 1:" + counter.getCount());
        }
    }
}
