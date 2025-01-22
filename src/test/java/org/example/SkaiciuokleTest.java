package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SkaiciuokleTest {

    private Skaiciuokle skaiciuokle;
    private Skaiciuokle skaiciuokleException;

    @BeforeEach
    void setUp() {
        System.out.println("-----------------Starting SkaiciuokleTest---------------");
        skaiciuokle = new Skaiciuokle(10, 5);
        skaiciuokleException = new Skaiciuokle(10, 0);
    }

    @AfterEach
    void tearDown() {
        System.out.println("-----------------Finishing SkaiciuokleTest---------------");
        skaiciuokle = null;
    }

    @Test
    void sudetis() {
        assertEquals(15, skaiciuokle.sudetis());
        assertNotEquals(5, skaiciuokle.sudetis());
        System.out.println("Result: " + skaiciuokle.sudetis());
    }

    @Test
    void atimtis() {
        assertEquals(5, skaiciuokle.atimtis());
        System.out.println("Result: " + skaiciuokle.atimtis());
    }

    @Test
    void daugyba() {
        assertEquals(50, skaiciuokle.daugyba());
        System.out.println("Result: " + skaiciuokle.daugyba());
    }

    @Test
    void testDalybaThrowsExceptionForZero() {


        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            skaiciuokleException.dalyba();
        });
        assertEquals("Negali dalintis iš 0", exception.getMessage() );
    }

    @Test
    void dalyba() {
        assertEquals(2, skaiciuokle.dalyba());
        System.out.println("Result: " + skaiciuokle.dalyba());
    }
}