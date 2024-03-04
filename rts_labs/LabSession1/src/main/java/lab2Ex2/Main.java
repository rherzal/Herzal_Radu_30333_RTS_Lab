package lab2Ex2;

public class Main {

    private static final int noOfThreads=6;

    private static final int processorLoad=10000000;

    public static void main(String args[]){

        View window = new View(noOfThreads);
        Model []m = new Model[noOfThreads];

        for(int i =0; i < noOfThreads; i++){
            m[i] = new Model(i, i+2, processorLoad);
            m[i].addObserver(window);
            m[i].start();
        }

    }

}