package lesson_3_operators;

public class Conditions {

    public static void main(String[] args) {

//        int a = 7;
//        int b = 6;
//
////        if(a < b){
////            System.out.println("a is less than b");
////        }
////        else if (a == b){
////            System.out.println("a equals b");
////        }
////        else {
////            System.out.println("a is not less than b");
////        }
//
//        boolean result = (a == b) ? true : false;
//        System.out.println(result);

        int c = 7;

        switch (c) {
            case 5:
                System.out.println("c equals 5");
                break;
            case 6:
                System.out.println("c equals 6");
                break;
            case 7:
                System.out.println("c equals 7");
                break;
            default:
                System.out.println("Default case");
                break;
        }
    }

}
