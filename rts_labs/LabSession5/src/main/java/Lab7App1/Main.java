package Lab7App1;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) throws BrokenBarrierException, InterruptedException {

            Semaphore P9 = new Semaphore(1);
            Semaphore P10 = new Semaphore(1);

            CyclicBarrier T8 = new CyclicBarrier(3);
        while (true) {
            ExecutionThread thread1 = new ExecutionThread(P9, P10, T8, 2, 4, 4, 6, 4);

            ExecutionThread thread2 = new ExecutionThread(P9, P10, T8, 3, 5, 5, 6, 5);

            System.out.println("P0");

            thread1.start();
            thread2.start();
            T8.await();
            T8.reset();
        }
    }
}
