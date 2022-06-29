package lesson_4_loops.classTasks;

public class Task_02_EvenNumbersForLoop {
    public static void main(String[] args) {

        //Вывести все четные числа от 1000 до 0 включительно
        for (int i = 1000; i >= 0; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
