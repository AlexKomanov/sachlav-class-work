package lesson_05_arrays_collections.collections;

import java.util.ArrayList;

public class Collections_01_ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(50);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);


        for (Integer integer : arrayList) {
            System.out.println("integer = " + integer);
        }

        System.out.println("---------------------------------------------------------");
        arrayList.add(0, 4);


        for (Integer integer : arrayList) {
            System.out.println("integer = " + integer);
        }

        System.out.println("---------------------------------------------------------");
        arrayList.set(1, 200);


        for (Integer integer : arrayList) {
            System.out.println("integer = " + integer);
        }
    }
}
