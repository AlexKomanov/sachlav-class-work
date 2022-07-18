package lesson_08_oop_accessModifiers_interfaces.polymorphism;

import lesson_07_oop.inheritance.Child;
import lesson_07_oop.inheritance.Girl;
import lesson_07_oop.inheritance.Person;
import lesson_07_oop.inheritance.Student;


import java.util.ArrayList;
import java.util.List;

public class PolyPersons {
    public static void main(String[] args) {

        Person child = new Child("child", "email", "phone", "parent name");
        Person girl = new Girl("girl", "email", "phone");
        Person student = new Student("student", "email", "phone", 3434.4);

        List<Person> persons = new ArrayList<>();
        persons.add(child);
        persons.add(girl);
        persons.add(student);

        persons.forEach((x) -> {
            x.walk();
            x.whoAreYou();
            x.speak();
        });
    }
}
