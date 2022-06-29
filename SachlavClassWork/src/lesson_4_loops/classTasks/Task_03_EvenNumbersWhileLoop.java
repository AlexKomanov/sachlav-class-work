package lesson_4_loops.classTasks;

public class Task_03_EvenNumbersWhileLoop {
    public static void main(String[] args) {

        //Вывести все числа от 0 до 1000 включительно которые делятся на 5
        int number = 0;

        while (number <= 1000) {
            if (number % 5 == 0) {
                System.out.println(number);
            }
            number++;
        }
    }
}
