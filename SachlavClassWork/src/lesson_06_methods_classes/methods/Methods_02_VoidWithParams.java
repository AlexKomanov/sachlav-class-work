package lesson_06_methods_classes.methods;

import java.util.Scanner;

public class Methods_02_VoidWithParams {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! \nWhat is your name? ");
        String name = scanner.nextLine();
        System.out.println("How old are you? ");
        int age = scanner.nextInt();

        printDetails(name, age);
    }

    public static void printDetails(String name, int age) {
        System.out.println("\nHello " + name + "!");
        System.out.println("Your age is: " + age + ".");
    }
}
