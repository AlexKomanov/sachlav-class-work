package lesson_08_oop_accessModifiers_interfaces.interfaces_module;

import lesson_08_oop_accessModifiers_interfaces.interfaces_module.interfaces.Breathable;
import lesson_08_oop_accessModifiers_interfaces.interfaces_module.interfaces.Runnable;

public class Dog extends Animal implements Breathable, Runnable {
    @Override
    public void howManyLegs() {
        System.out.println("I'm a dog, I have 4 legs");
    }

    @Override
    public void breathe() {
        System.out.println("I'm a dog - I can breathe.");
    }

    @Override
    public void run() {
        System.out.println("I'm a dog - I can run.");
    }
}
