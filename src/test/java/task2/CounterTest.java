package task2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    private Counter counter;

    @BeforeEach
    void setUp() {
        counter = new Counter(1);
        System.out.println("Initialized Counter with value 1.");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Test completed. Cleaning up Counter.");
        counter = null;
    }

    @Test
    void increment() {
        System.out.println("Running increment test...");
        assertEquals(1, counter.increment());
        assertEquals(2, counter.increment());
    }

    @Test
    void decrement() {
        System.out.println("Running decrement test...");
        assertEquals(-1, counter.decrement());
        assertEquals(-2, counter.decrement());
    }
}