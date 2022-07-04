package lesson_05_arrays_collections.classTasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Tasks_04_DuplicateNumbers {
    public static void main(String[] args) {

        int [] data = new int [100];

        Random r = new Random();

        for (int i= 0; i < data.length; i++)
            data [i] = r.nextInt(100);

        Map<Integer,Integer> rez = new HashMap<>();

        for (int i: data) {

            Integer tmp1 = i;

            if(rez.containsKey(tmp1)){
                int tmp2 = rez.get(tmp1)+1;
                rez.put(tmp1, tmp2);
            }
            else
                rez.put(tmp1, 0);
        }


        rez.forEach((x, y) ->  System.out.println(x + " duplicates " + y + " times"));
//        rez.forEach((x, y) ->  System.out.printf("Number...  %s, Duplicate...  %s\r\n", x, y));
//        for (Map.Entry<Integer,Integer> entry : rez.entrySet()) {
//            if(!entry.getValue().equals(0))
//                System.out.printf("Number...  %s, Duplicate...  %s\r\n", entry.getKey(), entry.getValue()+1);
//        }
    }
}
