package lesson_4_loops.logicOperators;

public class Operators_03_ExcludeOr {

    public static void main(String[] args) {

        boolean a = 6 > 5;  // true
        boolean b = 7 > 6;  // true
        boolean c = true;


        System.out.println(a ^ b ^ c); // false

        // a(true) ^ b(true) -> false

        // false ^ c(false) -> false
        // false ^ c(true) -> true

    }

}
