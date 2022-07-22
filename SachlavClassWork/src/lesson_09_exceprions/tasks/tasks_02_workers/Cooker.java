package lesson_09_exceprions.tasks.tasks_02_workers;

import lesson_09_exceprions.tasks.tasks_02_workers.interfaces.Cooking;

public class Cooker extends Worker implements Cooking {


    public Cooker(String name) {
        super(name);
    }

    @Override
    public void cook() {
        System.out.println("I'm a cooker " + getName() + " and I'm cooking");
    }
}
