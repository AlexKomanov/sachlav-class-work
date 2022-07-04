package lesson_05_arrays_collections.classTasks;

public class Tasks_02_CustomerArray {
    public static void main(String[] args) {

        double[] arr = {2, 5, 8, 10, 5, 20, 7, 89, 100, 200};

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
        average = sum / arr.length;
        System.out.println("average = " + average);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
