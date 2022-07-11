package lesson_07_oop_accessModifiers.inheritance;

public class Child extends Person{

    private String parentName;

    public Child(String name, String email, String phone, String parentName) {
        super(name, email, phone);
        this.parentName = parentName;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return "Child{" +
                "parentName='" + parentName + '\'' +
                "} " + super.toString();
    }

    @Override
    public void whoAreYou(){
        System.out.println("I'm a child");
    }

    @Override
    public void speak() {
        System.out.println("I'm speaking as a child");
    }

    @Override
    public void walk() {
        System.out.println("I'm walking as a child");
    }
}
