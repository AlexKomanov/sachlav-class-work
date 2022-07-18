package lesson_07_oop.inheritance;

public class MyPersons {

    public static void main(String[] args) {

        /**
         * Will trigger an error -> abstract class Person -> cannot be instantiated
         */
//        Person person = new Person("Person", "email", "phone");

        /**
         * Will trigger an error -> abstract class Teacher -> cannot be instantiated
         */
//        Teacher teacher = new Teacher()

        Student student = new Student("Alex", "alex@gmail.com", "023432432432", 60.6);
        Girl girl = new Girl("name", "email", "phone");
        Child child = new Child("Qwerty", "qwerty@gmail.com", "43354353", "ParentName");

        System.out.println(student);
        System.out.println(child);

        child.whoAreYou();
        student.whoAreYou();
        child.speak();
    }
}
