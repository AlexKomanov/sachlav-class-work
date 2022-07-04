package lesson_05_arrays_collections.collections;

import java.util.ArrayList;

public class Collections_01_ForEach {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(50);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);


        for (Integer integer : arrayList) {
            System.out.println("integer = " + integer);
        }

        arrayList.forEach(x -> System.out.println(x));
    }
}
