package lesson_07_oop.composition;

import java.util.Arrays;

public class Car {

    private String brand;
    private String color;
    private int year;
    private Engine engine;
    private Wheel[] wheels;

    //Constructor
    public Car(String brand, String color, int year, Engine engine, Wheel[] wheels) {
        this.brand = brand;
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.wheels = wheels;
    }

    //Getters and Setters

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    //toString()

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", engine=" + engine +
                ", wheels=" + Arrays.toString(wheels) +
                '}';
    }

}
