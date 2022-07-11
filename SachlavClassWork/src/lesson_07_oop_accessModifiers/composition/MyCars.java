package lesson_07_oop_accessModifiers.composition;

public class MyCars {
    public static void main(String[] args) {

        Engine bmwEngine = new Engine(2018, 2500, 4);
        Wheel[] bmwWheels = {
                new Wheel(18, 2.2),
                new Wheel(18, 2.2),
                new Wheel(18, 2.2),
                new Wheel(18, 2.2),
                new Wheel(18, 2.2),
        };

        Car bmw = new Car("BMW", "black", 2021, bmwEngine, bmwWheels );
        Car bmw2 = new Car("BMW", "black", 2021, new Engine(2021, 1200, 8), bmwWheels );

        System.out.println(bmw.toString());
        System.out.println(bmw2.toString());
    }
}
