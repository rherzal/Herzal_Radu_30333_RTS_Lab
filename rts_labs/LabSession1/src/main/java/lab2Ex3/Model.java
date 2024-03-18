package lab2Ex3;

import java.util.Observable;
import java.util.Random;

public class Model extends Observable implements Runnable {
    public int verticalPosition;
    public Thread thread;

    public boolean running;

    public Model(int verticalPosition, boolean running) {
        this.thread = new Thread(this);
        this.verticalPosition = verticalPosition;
        this.running = false;
    }

    public void start() {
        this.running = true;
        this.thread.start();
    }

    @Override
    public void run() {
        Random random = new Random();
        while(running) {
            verticalPosition -= random.nextInt(100);
            this.setChanged();
            this.notifyObservers();
        }
    }
}
