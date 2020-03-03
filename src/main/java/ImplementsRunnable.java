public class ImplementsRunnable implements Runnable {
    private int iterations;
    private Counter counter;

    public ImplementsRunnable(Counter counter, int iterations) {
        this.counter = counter;
        this.iterations = iterations;
    }

    @Override
    public void run() {
        while (counter.getCount() < iterations) {
            counter.increment();
            System.out.println("Thread 2:" + counter.getCount());
        }
    }
}
