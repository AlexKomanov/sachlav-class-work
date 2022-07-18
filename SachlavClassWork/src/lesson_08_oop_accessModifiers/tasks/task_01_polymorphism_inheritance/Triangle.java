package lesson_08_oop_accessModifiers.tasks.task_01_polymorphism_inheritance;

public class Triangle extends Figure {


    public Triangle(double height, double width) {
        super(height, width);
    }

    @Override
    public void calculateArea() {
        System.out.println("Triangle area: " + (height * width / 2));
    }
}
