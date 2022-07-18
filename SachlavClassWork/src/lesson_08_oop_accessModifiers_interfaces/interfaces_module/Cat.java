package lesson_08_oop_accessModifiers_interfaces.interfaces_module;

import lesson_08_oop_accessModifiers_interfaces.interfaces_module.interfaces.Breathable;

public class Cat extends Animal implements Breathable {
    @Override
    public void howManyLegs() {
        System.out.println("I'm a cat, I have 4 legs");
    }

    @Override
    public void breathe() {
        System.out.println("I'm a cat - I can breathe.");
    }

    public void voice() {
        System.out.println("Mew");
    }
}