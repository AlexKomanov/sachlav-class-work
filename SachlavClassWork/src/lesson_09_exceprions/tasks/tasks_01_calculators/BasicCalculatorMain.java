package lesson_09_exceprions.tasks.tasks_01_calculators;

public class BasicCalculatorMain {
    public static void main(String[] args) {

        BasicCalculator calculator = new BasicCalculator();

        calculator.division(2, 0);

        calculator.sum(2.5, 3.6);
        calculator.minus(2.5, 3.6);
        calculator.multiple(2.5, 3.6);

    }
}
