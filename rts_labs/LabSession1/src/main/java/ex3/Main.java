package ex3;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String []args){
        Random random = new Random();
        int [] array = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(200);
        }

        Arrays.sort(array);

        for (int i = 0; i < 10; i++) {
            System.out.println(array[i] + ' ');
        }


    }
}
