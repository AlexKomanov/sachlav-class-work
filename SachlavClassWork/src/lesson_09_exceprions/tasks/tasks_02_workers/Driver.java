package lesson_09_exceprions.tasks.tasks_02_workers;

import lesson_09_exceprions.tasks.tasks_02_workers.interfaces.Driving;

public class Driver extends Worker implements Driving {

    public Driver(String name) {
        super(name);
    }

    @Override
    public void voice() {
        super.voice();
    }

    @Override
    public void drive() {
        System.out.println("I'm a driver " + getName() + " and I'm driving");
    }
}
