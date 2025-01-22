package task2;

public class Counter {
    int value;

    public Counter(int value) {
        this.value = 0;
    }

    public int increment () {
        return ++value;
    }

    public int decrement () {
        return --value;
    }
}
