package lesson_07_oop.access_modifiers;

public class MainClass {

    public static void main(String[] args) {

        Examples examples = new Examples();

        System.out.println(examples.FINAL_NUMBER);
        System.out.println(examples.number);
        System.out.println(examples.protectedNumber);
//        System.out.println(examples.privateNumber); //error

        System.out.println(Examples.staticNumber);
    }




}
