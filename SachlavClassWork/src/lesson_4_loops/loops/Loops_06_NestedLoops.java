package lesson_4_loops.loops;

public class Loops_06_NestedLoops {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println();
            System.out.println("i = " + i);
            System.out.println();
            for (int j = 0; j < 5; j++) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
}
