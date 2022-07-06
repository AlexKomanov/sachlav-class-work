package lesson_06_methods_classes.classes.cars;

public class MyCars {
    public static void main(String[] args) {

        Car bmw = new Car();
//        Car bmw = new Car("MyBmw", 2019);

        bmw.manufacture = "BMW";
        bmw.color = "Black";
         bmw.year = 2021;
//        bmw.numberOfWheels = 4;

        System.out.println(bmw.manufacture);

        Car opel = new Car();
        opel.manufacture = "Opel";
        opel.color = "Blue";
        opel.year = 2017;
//        opel.numberOfWheels = 4;

        System.out.println(opel.manufacture);
        System.out.println(opel); // Without toString() -> ?

//        Car newCar = new Car("Tesla", "White", 2022);
    }
}
