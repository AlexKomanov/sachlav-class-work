package lesson_06_methods_classes.classes.students;

import java.util.Scanner;

public class Student {

    private Scanner scanner = new Scanner(System.in);
    private String name;
    private String course;
    private int age;

    private static int registeredStudents;

    public Student(String name, String course, int age) {
        this.name = name;
        this.course = course;
        while (age < 18) {
            System.out.println("Age incorrect, try again...");
            age = this.scanner.nextInt();
        }
        this.age = age;
        registeredStudents++;

    }

    public static void printRegisteredStudents() {
        System.out.println(registeredStudents);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", age=" + age +
                '}';
    }

    public void printAllInfo(){
        String allInfo = this.toString();
        System.out.println(allInfo);
    }
}
