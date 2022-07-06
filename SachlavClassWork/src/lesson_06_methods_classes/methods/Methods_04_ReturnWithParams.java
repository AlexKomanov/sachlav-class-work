package lesson_06_methods_classes.methods;

import java.util.Scanner;

public class Methods_04_ReturnWithParams {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter first number: ");
        int secondNumber = scanner.nextInt();

        int result = summary(firstNumber, secondNumber);

        System.out.println("result = " + result);

        scanner.close();
    }

    public static int summary(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

}
