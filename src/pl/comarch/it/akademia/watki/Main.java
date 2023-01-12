package pl.comarch.it.akademia.watki;

public class Main {
    public static void main(String[] args) {
        /*Watek watek1 = new Watek(1);
        Watek watek2 = new Watek(2);
        Watek watek3 = new Watek(3);
        Watek watek4 = new Watek(4);

        watek1.start();
        watek2.start();
        watek3.start();
        watek4.start();*/

        Thread w1 = new Thread(new LepszyWatek(1));
        Thread w2 = new Thread(new LepszyWatek(2));
        Thread w3 = new Thread(new LepszyWatek(3));
        Thread w4 = new Thread(new LepszyWatek(4));

        w1.start();
        w2.start();
        w3.start();
        w4.start();

        System.out.println("Koniec !!");
    }
}
