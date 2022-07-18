package lesson_07_oop.inheritance;

public class Student extends Person{

    private double averageGrade;

    public Student(String name, String email, String phone, double averageGrade) {
        super(name, email, phone);
        this.averageGrade = averageGrade;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "averageGrade=" + averageGrade +
                "} " + super.toString();
    }

    @Override
    public void whoAreYou() {
        System.out.println("I'm a student");
    }

    @Override
    public void walk() {
        System.out.println("Walking as a student");
    }

    @Override
    public void speak() {
        System.out.println("I'm speaking as a student");
    }
}
