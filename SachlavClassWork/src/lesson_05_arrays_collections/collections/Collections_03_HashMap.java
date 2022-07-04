package lesson_05_arrays_collections.collections;

import java.util.HashMap;
import java.util.Map;

public class Collections_03_HashMap {
    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Alex");
        hashMap.put(4, "Ira");
        hashMap.put(2, "Qwerty");
        hashMap.put(6, "Arseniy");


        System.out.println(hashMap.get(2));
        System.out.println(hashMap.containsKey(1));
        System.out.println(hashMap.containsValue("Qwerty"));

//        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
//            System.out.println(entry.getKey() + " - " + entry.getValue());
//
//        }

        hashMap.forEach((x, y) -> System.out.println(x + " - " + y));

    }
}
