package lesson_09_exceprions.tasks.tasks_02_workers;

import lesson_09_exceprions.tasks.tasks_02_workers.interfaces.Programming;

public class Developer extends Worker implements Programming {


    public Developer(String name) {
        super(name);
    }

    @Override
    public void voice() {
        super.voice();
    }

    @Override
    public void develop() {
        System.out.println("I'm a developer " + getName() + " and I'm developing");
    }
}
