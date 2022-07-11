package lesson_07_oop_accessModifiers.inheritance;

public class Girl extends Person{

    public Girl(String name, String email, String phone) {
        super(name, email, phone);
    }

    @Override
    public void speak() {
        System.out.println("I'm speaking as a girl");
    }
}
