public class ImplementsRunnable implements Runnable {
    private Counter counter;

    public ImplementsRunnable(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (counter.getCount() < 100) {
            counter.increment();
            System.out.println("Thread 2:" + counter.getCount());
        }
    }
}
