package lesson_09_exceprions.tasks.tasks_01_calculators;

public class ScienceCalculator implements Calculate {

    @Override
    public void sum(double a, double b) {
        System.out.println("Result = " + (a + b));
    }

    @Override
    public void minus(double a, double b) {
        System.out.println("Result = " + (a - b));
    }

    @Override
    public void multiple(double a, double b) {
        System.out.println("Result = " + (a * b));
    }

    @Override
    public void division(double a, double b) {
        try {
            if (b != 0.0) {
                System.out.println("Result = " + (a / b));
            } else {
//                System.out.println("Result = " + (int)a / (int)b);
                throw new DivideByZeroException("Oh no! You tried to divide by ZERO...");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void performAction(int action, double numberA, double numberB) {
        switch (action) {
            case 1:
                sum(numberA, numberB);
                break;
            case 2:
                minus(numberA, numberB);
                break;
            case 3:
                multiple(numberA, numberB);
                break;
            case 4:
                division(numberA, numberB);
                break;
        }

    }

}
