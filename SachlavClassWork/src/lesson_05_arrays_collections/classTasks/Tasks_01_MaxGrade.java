package lesson_05_arrays_collections.classTasks;

public class Tasks_01_MaxGrade {
    public static void main(String[] args) {

        //       0        1       2         3        4
        String[] names = {"Alex", "Roman", "Pavel", "Polina", "Elizaveta"};
        int [] grades =     {30,      20,     50,      70,       100};


        int maxGrade = grades[0];
        int index = 0;

        for (int i = 1; i < grades.length; i++){
            if (grades[i] > maxGrade){
                maxGrade = grades[i];
                index = i;
            }
        }
        System.out.println(names[index] +  " - grade = " + maxGrade);



    }
}
