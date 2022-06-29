package lesson_4_loops.loops;

import java.util.Scanner;

public class Loops_02_While {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Insert your number: ");
        int counter = input.nextInt();
        while (counter < 1000) {
            System.out.println(counter);
            counter++;

            //А если мы не добавим counter++?
            // Что тогда?
        }
    }
}
