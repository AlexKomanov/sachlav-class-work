package lesson_4_loops.loops;

public class Loops_05_BreakContinue {
    public static void main(String[] args) {

        int counter = 0;

        while (counter < 10) {
            counter++;
            if (counter == 5){
                continue;
            }
            if (counter == 8){
                break;
            }
            System.out.println("counter = " + counter);
        }
    }
}
