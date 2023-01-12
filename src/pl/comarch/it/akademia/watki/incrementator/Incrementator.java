package pl.comarch.it.akademia.watki.incrementator;

public class Incrementator implements Runnable {

    private IncrementatorObject incrementatorObject;

    public Incrementator(IncrementatorObject incrementatorObject) {
        this.incrementatorObject = incrementatorObject;
    }

    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            this.incrementatorObject.increment();
        }
    }

    private synchronized void increment() {
        Main.counter++;
    }
}
