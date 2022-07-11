package lesson_07_oop_accessModifiers.tasks.task_02_polymorphism_inheritance;

public class Rectangle extends Figure{

    public Rectangle(double height, double width) {
        super(height, width);
    }

    @Override
    public void calculateArea() {
        System.out.println("Rectangle area: " + (height * width));
    }
}
