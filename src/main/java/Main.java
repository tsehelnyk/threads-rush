public class Main {
    private static final int ITERATIONS = 100;

    public static void main(String[] args) {
        Counter counter = new Counter();
        ExtendsThread thread1 = new ExtendsThread(counter, ITERATIONS);
        Thread thread2 = new Thread(new ImplementsRunnable(counter, ITERATIONS));
        thread1.start();
        thread2.start();
    }
}
