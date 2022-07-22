package lesson_09_exceprions.tasks.tasks_01_calculators;

import java.util.Scanner;

public class ScienceCalculatorMain {
    public static void main(String[] args) {

        int operation;

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to my calculator!");
        //sum minus multiple division
        System.out.println("Choose one of actions: \n1-sum \n2-minus \n3-multiple \n4-division");

        operation = input.nextInt();
        while(operation > 4 || operation < 1) {
            System.out.println("Wrong value.");
            System.out.println("Choose one of actions: \n1-sum \n2-minus \n3-multiple \n4-division");
            operation = input.nextInt();
        }
        System.out.println("Insert first number");
        double firstNumber = input.nextDouble();
        System.out.println("Insert second number");
        double secondNumber = input.nextDouble();

        ScienceCalculator calculator = new ScienceCalculator();
        calculator.performAction(operation, firstNumber, secondNumber);
    }
}
