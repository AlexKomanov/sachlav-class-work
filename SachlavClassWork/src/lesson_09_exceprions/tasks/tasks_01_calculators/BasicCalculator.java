package lesson_09_exceprions.tasks.tasks_01_calculators;

public class BasicCalculator implements Calculate {

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
        System.out.println("Result = " + ((int) a / (int) b));
    }
//    @Override
//    public void division(double a, double b) {
//        try {
//            if(b != 0.0) {
//                System.out.println("Result = " + (a / b));
//            }
//            else {
////               long result = Math.round(a) / Math.round(b);
//                int result = (int)a / (int)b;
//            }
//
//        } catch (ArithmeticException ae) {
//            System.out.println(ae.getMessage());
//        }
//    }
}
