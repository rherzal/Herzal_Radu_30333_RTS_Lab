package lab2Ex2;

import java.util.Observable;

public class Model extends Observable implements Runnable {
    public int id;
    public int processLoad;

    public int c = 0;

    Thread t;

    public Model(int id, int priority, int procLoad) {
        this.id = id;
        this.c = 0;
        this.processLoad = procLoad;
        t = new Thread(this);
        this.t.setPriority(priority);
    }

    public void start() {
        if (this.t != null) {
            t.start();
        }
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setProcessLoad(int processLoad) {
        this.processLoad = processLoad;
    }

    public void setT(Thread t) {
        this.t = t;
    }



    public int getId() {
        return id;
    }

    public int getProcessLoad() {
        return processLoad;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }



    @Override
    public void run() {
        while (this.c < 1000) {
            for(int j=0;j<this.processLoad;j++){
                j++;
            }
            this.c++;
            this.setChanged();
            this.notifyObservers();
        }
    }
}
