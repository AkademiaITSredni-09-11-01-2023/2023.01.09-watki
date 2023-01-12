package pl.comarch.it.akademia.watki.incrementator;

public class IncrementatorObject {
    public synchronized void increment() {
        Main.counter++;
    }
}
