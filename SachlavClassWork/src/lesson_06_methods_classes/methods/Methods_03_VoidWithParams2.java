package lesson_06_methods_classes.methods;

import java.util.ArrayList;

public class Methods_03_VoidWithParams2 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        printArrayList(arrayList);

        arrayList.add(6);

        printArrayList(arrayList);
    }

    public static void printArrayList(ArrayList<Integer> list) {
        System.out.println("\n ----- Array List ----- ");
        list.forEach((x) -> System.out.print(x + " "));
        System.out.println();
    }
}
