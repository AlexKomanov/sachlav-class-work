package lesson_08_oop_accessModifiers.tasks.task_01_polymorphism_inheritance;

public class Square extends Figure {


    public Square(double height, double width) {
        super(height, width);
    }

    @Override
    public void calculateArea() {
        System.out.println("Square area: " + (Math.pow(height, 2)));
    }
}
