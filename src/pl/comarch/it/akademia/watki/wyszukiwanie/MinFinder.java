package pl.comarch.it.akademia.watki.wyszukiwanie;

import java.util.Random;

public class MinFinder implements Runnable {

    private int[] tab;
    private int startIndex;
    private int endIndex;

    public MinFinder(int[] tab, int startIndex, int endIndex) {
        this.tab = tab;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public void run() {
        Random random = new Random();
        for(int i = this.startIndex; i < this.endIndex; i++) {
            this.tab[i] = random.nextInt(1000000000);
        }

        int min = this.tab[startIndex];
        for(int i = this.startIndex; i < this.endIndex; i++) {
            if(this.tab[i] < min) {
                min = this.tab[i];
            }
        }

        synchronized (App2.results) {
            App2.results.add(min);
        }
    }
}
