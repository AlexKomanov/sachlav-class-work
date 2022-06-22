package lesson_3_operators.tasks;

import java.util.Scanner;

public class MinMaxAverage {
    public static void main(String[] args) {

        double maximum;
        double minimum;
        double average;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        double a = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        double b = scanner.nextDouble();
        System.out.println("Введите третье число: ");
        double c = scanner.nextDouble();

        maximum = (a > b) ? a : b;
        maximum = (maximum > c) ? maximum : c;

        System.out.println("maximum = " + maximum);

        minimum = (a < b) ? a : b;
        minimum = (minimum < c) ? minimum : c;

        System.out.println("minimum = " + minimum);
        average = (a + b + c) / 3;

        System.out.println("average = " + average);

    }
}
