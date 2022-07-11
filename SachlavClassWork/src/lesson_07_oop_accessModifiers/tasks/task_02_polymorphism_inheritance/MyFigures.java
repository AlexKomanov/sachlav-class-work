package lesson_07_oop_accessModifiers.tasks.task_02_polymorphism_inheritance;

import java.util.ArrayList;
import java.util.List;

public class MyFigures {
    public static void main(String[] args) {

        Figure rectangle = new Rectangle(10, 5);
        Figure triangle = new Triangle(5, 15);
        Figure square = new Square(10, 10);

        List<Figure> figures = new ArrayList<>();

        figures.add(rectangle);
        figures.add(triangle);
        figures.add(square);

        figures.forEach((x) -> x.calculateArea());
    }
}
