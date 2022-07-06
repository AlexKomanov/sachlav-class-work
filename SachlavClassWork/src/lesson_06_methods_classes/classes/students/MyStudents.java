package lesson_06_methods_classes.classes.students;

public class MyStudents {
    public static void main(String[] args) {

        Student student = new Student("Alex", "Math", 17);

//        System.out.println(student.toString());

        student.printAllInfo();
        Student.printRegisteredStudents();

        Student student2 = new Student("Alex", "Math", 20);

        Student.printRegisteredStudents();
    }
}
