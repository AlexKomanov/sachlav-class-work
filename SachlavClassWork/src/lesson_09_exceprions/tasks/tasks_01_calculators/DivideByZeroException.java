package lesson_09_exceprions.tasks.tasks_01_calculators;

public class DivideByZeroException extends Exception {

    public DivideByZeroException(String message) {
        super(message);
    }
}
