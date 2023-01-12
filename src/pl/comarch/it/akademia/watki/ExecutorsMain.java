package pl.comarch.it.akademia.watki;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorsMain {
    public static void main(String[] args) {
        /*ExecutorService executorService =
                Executors.newSingleThreadExecutor();

        executorService.submit(new LepszyWatek(1));
        executorService.submit(new LepszyWatek(2));
        executorService.submit(new LepszyWatek(3));
        executorService.submit(new LepszyWatek(4));

        executorService.shutdown();*/

        /*ExecutorService multiExecutor = Executors.newFixedThreadPool(4);
        multiExecutor.submit(new LepszyWatek(1));
        multiExecutor.submit(new LepszyWatek(2));
        multiExecutor.submit(new LepszyWatek(3));
        multiExecutor.submit(new LepszyWatek(4));
        multiExecutor.submit(new LepszyWatek(5));
        multiExecutor.submit(new LepszyWatek(6));
        multiExecutor.submit(new LepszyWatek(7));
        multiExecutor.submit(new LepszyWatek(8));

        multiExecutor.shutdown();*/

        ScheduledExecutorService scheduledExecutorService =
                Executors.newScheduledThreadPool(4);

        scheduledExecutorService.schedule(new LepszyWatek(1), 0, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new LepszyWatek(2), 5, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new LepszyWatek(3), 2, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new LepszyWatek(4), 7, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new LepszyWatek(5), 0, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new LepszyWatek(6), 10, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new LepszyWatek(7), 15, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new LepszyWatek(8), 3, TimeUnit.SECONDS);

        scheduledExecutorService.shutdown();
    }
}
