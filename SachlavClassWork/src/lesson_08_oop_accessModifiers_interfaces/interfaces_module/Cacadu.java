package lesson_08_oop_accessModifiers_interfaces.interfaces_module;

import lesson_08_oop_accessModifiers_interfaces.interfaces_module.interfaces.Breathable;
import lesson_08_oop_accessModifiers_interfaces.interfaces_module.interfaces.Flyable;

public class Cacadu extends Animal implements Flyable, Breathable, Runnable{
    @Override
    public void howManyLegs() {
        System.out.println("I'm a cacadu, I have 2 legs");
    }

    @Override
    public void fly() {
        System.out.println("I'm a cacadu - I can fly.");
    }

    @Override
    public void breathe() {
        System.out.println("I'm a cacadu - I can breathe.");
    }

    @Override
    public void run() {
        System.out.println("I'm a cacadu - I can run.");
    }
}