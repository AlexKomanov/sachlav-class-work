package lesson_09_exceprions.custom_exceptions;

public class WorkerIsNotReadyException extends Exception {

    public WorkerIsNotReadyException(String message) {
        super(message);
    }
}
