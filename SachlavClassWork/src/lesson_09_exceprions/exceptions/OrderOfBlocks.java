package lesson_09_exceprions.exceptions;

public class OrderOfBlocks {
    public static void main(String[] args) {

        try {
            int i = Integer.parseInt("23rsdfg");
            System.out.println("After Exception");
        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }
        catch (NumberFormatException numberFormatException) {
//            numberFormatException.printStackTrace();
            System.out.println("It's not a number!!!!");
        }

        finally {
            System.out.println("Inside finally block");
        }

        System.out.println("After exceptions code block");
    }
}
