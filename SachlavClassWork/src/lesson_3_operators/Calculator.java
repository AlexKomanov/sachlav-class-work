package lesson_3_operators;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Insert first number: ");
        double a = input.nextDouble();
        System.out.print("Insert second number: ");
        double b = input.nextDouble();
        double result = a + b;
        System.out.println("result = " + result);

    }
}
