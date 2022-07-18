package lesson_08_oop_accessModifiers_interfaces.tasks.task_01_polymorphism_inheritance;

public class Rectangle extends Figure {

    public Rectangle(double height, double width) {
        super(height, width);
    }

    @Override
    public void calculateArea() {
        System.out.println("Rectangle area: " + (height * width));
    }
}
