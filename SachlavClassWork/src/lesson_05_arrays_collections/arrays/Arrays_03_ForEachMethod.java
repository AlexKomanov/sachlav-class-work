package lesson_05_arrays_collections.arrays;

public class Arrays_03_ForEachMethod {
    public static void main(String[] args) {

        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 20;


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;

        }

        System.out.println("\nFirst Iteration ");
        for (int number : numbers) {

            System.out.print(number + " ");
        }

        for (int number : numbers) {
            number = number +  5; //Не переписывает значения
        }

        System.out.println("\nSecond Iteration ");
        for (int number : numbers) {

            System.out.print(number + " ");
        }
    }
}
