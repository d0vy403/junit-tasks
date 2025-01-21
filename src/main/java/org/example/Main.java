package org.example;

public class Main {
    public static void main(String[] args) {
        Skaiciuokle count = new Skaiciuokle(1, 0);
        int plius = count.sudetis();
        count.atimtis();
        count.dalyba();
        count.daugyba();

        System.out.println(plius);

    }
}