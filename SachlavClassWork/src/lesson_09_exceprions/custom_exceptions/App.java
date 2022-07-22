package lesson_09_exceprions.custom_exceptions;

public class App {
    public static void main(String[] args) {

        Worker worker = new Worker("John");

        worker.atWork();
        worker.onVacation();

//        try {
//            worker.goToWork();
//        } catch (WorkerIsNotReadyException e) {
//            e.printStackTrace();
//        }

//        worker.goToWork();


    }
}
