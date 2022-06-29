package lesson_4_loops.loops;

public class Loops_04_VisibilityOfVariables {
    public static void main(String[] args) {

        String textOutside = "Outside";

        for (int i = 0; i < 500; i++) {
            int number = 0;

            textOutside = "Now Inside";

            String textInside = "Text";
        }
        int number = 5;
        
//        int number = 10; // Мы не можем создать две переменные с одинаковым названием

//        textInside // Нам переменная не доступна вне цикла.

    }
}
