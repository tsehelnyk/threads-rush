public class Counter {
    private volatile int count;

    public Counter() {
        count = 0;
    }

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
