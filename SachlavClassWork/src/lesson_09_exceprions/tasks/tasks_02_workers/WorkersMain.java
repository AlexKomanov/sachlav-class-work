package lesson_09_exceprions.tasks.tasks_02_workers;

public class WorkersMain {
    public static void main(String[] args) {

        Driver driver = new Driver("Alex");
        driver.drive();
        driver.voice();

        Developer developer = new Developer("Sasha");
        developer.develop();
        developer.voice();

        Cooker cooker = new Cooker("Shurik");
        cooker.cook();
        cooker.voice();
    }
}
