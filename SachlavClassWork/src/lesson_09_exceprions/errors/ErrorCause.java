package lesson_09_exceprions.errors;

public class ErrorCause {
    public static void main(String[] args) {
        calculateFactorial(-1);
    }

    public static int calculateFactorial(int number) {
        return number * calculateFactorial(number - 1);
    }
}
