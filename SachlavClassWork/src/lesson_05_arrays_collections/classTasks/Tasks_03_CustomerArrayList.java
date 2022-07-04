package lesson_05_arrays_collections.classTasks;

import java.util.ArrayList;

public class Tasks_03_CustomerArrayList {
    public static void main(String[] args) {

        ArrayList<Double> arr = new ArrayList<>(10);

        System.out.println(arr.size());
        double[] numbers = {2, 5, 8, 10, 5, 20, 7, 89, 100, 200};

        for (double number : numbers) {
            arr.add(number);
        }
        System.out.println(arr.size());
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double sum = 0;
        double average = 0;

        System.out.println("Odd Numbers: ");
        for (double number : arr) {
            if (number % 2 != 0.0) {
                System.out.print(number + " ");
            }

            if (number > max) {
                max = number;
            }

            if (number < min) {
                min = number;
            }

            sum += number;

        }

        System.out.println();
        System.out.println("sum = " + sum);
        average = sum / arr.size();
        System.out.println("average = " + average);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
