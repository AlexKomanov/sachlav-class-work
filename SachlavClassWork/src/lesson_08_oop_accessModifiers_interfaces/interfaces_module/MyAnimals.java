package lesson_08_oop_accessModifiers_interfaces.interfaces_module;

import lesson_08_oop_accessModifiers_interfaces.interfaces_module.interfaces.Breathable;

import java.util.ArrayList;

public class MyAnimals {
    public static void main(String[] args) {

        //        Animal bird = new Bird();
//        Animal cacadu = new Cacadu();
//        Animal cat = new Cat();
//        Animal dog = new Dog();
//        Animal fish = new Fish();
//        Animal shark = new Shark();
//
//        ArrayList<Animal> myAnimals = new ArrayList<>();
//        myAnimals.add(bird);
//        myAnimals.add(cacadu);
//        myAnimals.add(cat);
//        myAnimals.add(dog);
//        myAnimals.add(fish);
//        myAnimals.add(shark);
//
//        for(Animal animal : myAnimals) {
//            animal.howManyLegs();
//        }

        Fish fish = new Fish();
        Breathable bird = new Bird();
        Breathable cat = new Cat();
        Cat cat2 = new Cat();
        Animal cat3 = new Cat();
        ArrayList<Breathable> breatheAnimals = new ArrayList<>();
        breatheAnimals.add(bird);
        breatheAnimals.add(cat);
        cat2.voice();
        //       cat.OXYGEN_AMOUNT = 7; // <- error
//        cat.voice(); // <- error
//        cat3.voice(); // <- error

//        Cat cat4 = (Cat) cat3;  //<- DownCasting


        for (Breathable breatheAnimal : breatheAnimals) {
            breatheAnimal.breathe();
            System.out.println(breatheAnimal.OXYGEN_AMOUNT);
        }


    }
}
