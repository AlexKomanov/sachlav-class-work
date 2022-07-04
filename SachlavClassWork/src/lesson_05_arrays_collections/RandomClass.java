package lesson_05_arrays_collections;

import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {

        int [] data = new int [100];

        Random r = new Random();

        for (int i= 0; i < data.length; i++) {
            data [i] = r.nextInt(100);
        }

        for (int number : data) {
            System.out.println(number);
        }

    }
}
