package lesson_09_exceprions.custom_exceptions;

public class Worker {

    String name;
    boolean readyToWork;


    void atWork() {
        readyToWork = true;
    }

    void onVacation() {
        readyToWork = false;
    }



    void goToWork() throws WorkerIsNotReadyException {
        if (readyToWork ) {
            System.out.println("Can work!");
        }
        else {
            throw new WorkerIsNotReadyException("Worker is not ready");
        }
    }

    public Worker(String name) {
        this.name = name;
    }
}
