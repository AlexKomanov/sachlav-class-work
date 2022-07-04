package lesson_05_arrays_collections.arrays;

public class Arrays_01_SimpleArrays {
    public static void main(String[] args) {

        int simpleNumber = 3;


        int[] numbers = new int[5]; // Default values
        numbers[0] = 10;
        numbers[1] = 20;


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;

        }
        numbers[0] = 90;

        for (int number : numbers) {
            System.out.println(number);
        }


        int[] numbers2 = {4, 6, 8};
        System.out.println("numbers2[0] = " + numbers2[0]);
        System.out.println("numbers2[1] = " + numbers2[1]);
        System.out.println("numbers2[2] = " + numbers2[2]);


        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }
    }
}
