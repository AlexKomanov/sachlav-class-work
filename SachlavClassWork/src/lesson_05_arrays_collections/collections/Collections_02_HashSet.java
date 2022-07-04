package lesson_05_arrays_collections.collections;

import java.util.HashSet;

public class Collections_02_HashSet {
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("B");
        hashSet.add("A");
        hashSet.add("C");
        hashSet.add("E");
        hashSet.add("e");
        hashSet.add("e");
        hashSet.add("D");
        hashSet.add("D");

        HashSet<Integer> hashSetInt = new HashSet<>();
        hashSetInt.add(45);
        hashSetInt.add(46);
        hashSetInt.add(41);
        hashSetInt.add(2);
        hashSetInt.add(2);
        hashSetInt.add(10);

        for (Integer integer : hashSetInt) {
            System.out.println(integer);
        }

        System.out.println("--------------------------");

        for (String s : hashSet) {
            System.out.println(s);
        }
    }
}
