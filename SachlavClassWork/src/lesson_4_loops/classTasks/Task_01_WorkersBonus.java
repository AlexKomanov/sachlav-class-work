package lesson_4_loops.classTasks;

import java.util.Scanner;

public class Task_01_WorkersBonus {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Какая у вас зарплата?");
        double currentSalary = input.nextDouble();
        //Scanner

        System.out.println("Какой у вас опыт работы?");
        int experience = input.nextInt();
        //Scanner

        if(experience >= 0 && experience < 5) {
            currentSalary *= 1.1;
        }
        else if(experience >= 5 && experience < 10) {
            currentSalary *= 1.15;
        }
        else if(experience >= 10 && experience < 15) {
            currentSalary *= 1.25;
        }
        else if(experience >= 15 && experience < 20) {
            currentSalary *= 1.35;
        }
        else if(experience >= 20 && experience < 25) {
            currentSalary *= 1.45;
        }
        else if(experience >= 25 ) {
            currentSalary *= 1.55;
        }
        System.out.println("currentSalary = " + currentSalary);
    }
}
