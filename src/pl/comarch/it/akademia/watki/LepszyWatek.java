package pl.comarch.it.akademia.watki;

public class LepszyWatek implements Runnable {

    private int number;

    public LepszyWatek(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            System.out.println("Watek: " + this.number + " i: " + i);
        }
    }
}
