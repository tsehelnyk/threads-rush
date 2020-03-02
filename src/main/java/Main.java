public class Main {

    public static void main(String[] args) {
        Counter counter = new Counter();

        ExtendsThread thread1 = new ExtendsThread(counter);
        Thread thread2 = new Thread(new ImplementsRunnable(counter));

        thread1.start();
        thread2.start();
    }
}
