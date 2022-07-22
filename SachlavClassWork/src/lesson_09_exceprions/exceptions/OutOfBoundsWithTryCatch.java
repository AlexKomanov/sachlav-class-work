package lesson_09_exceprions.exceptions;

public class OutOfBoundsWithTryCatch {
    public static void main(String[] args) {

        int[] numbers = new int[4];

        try {
            System.out.println("Begin");
            numbers[7] = 56;
            System.out.println("End");
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
//            System.out.println("Ooops I have an issue " + arrayIndexOutOfBoundsException);
//            arrayIndexOutOfBoundsException.printStackTrace();
//            System.out.println("arrayIndexOutOfBoundsException.getMessage() = " + arrayIndexOutOfBoundsException.getMessage());
//            System.out.println("arrayIndexOutOfBoundsException.getCause() = " + arrayIndexOutOfBoundsException.getCause());
        } catch (Exception e) {
            System.out.println("Exception is " + e);
        }


    }
}
