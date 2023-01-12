package pl.comarch.it.akademia.watki.wyszukiwanie;


import java.util.ArrayList;

public class App2 {

    public static final ArrayList<Integer> results = new ArrayList<>();
    public static void main(String[] args) {
        int[] tab = new int[700000000];

        long startTime = System.currentTimeMillis();
        Thread w1 = new Thread(new MinFinder(tab, 0, 100000000));
        Thread w2 = new Thread(new MinFinder(tab, 100000000, 200000000));
        Thread w3 = new Thread(new MinFinder(tab, 200000000, 300000000));
        Thread w4 = new Thread(new MinFinder(tab, 300000000, 400000000));
        Thread w5 = new Thread(new MinFinder(tab, 400000000, 500000000));
        Thread w6 = new Thread(new MinFinder(tab, 500000000, 600000000));
        Thread w7 = new Thread(new MinFinder(tab, 600000000, 700000000));

        w1.start();
        w2.start();
        w3.start();
        w4.start();
        w5.start();
        w6.start();
        w7.start();

        try {
            w1.join();
            w2.join();
            w3.join();
            w4.join();
            w5.join();
            w6.join();
            w7.join();
        } catch (InterruptedException e) {}

        int min = results.get(0);
        for(int element : results) {
            if (element < min) {
                min = element;
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println(min);
        System.out.println(endTime - startTime);
    }
}
