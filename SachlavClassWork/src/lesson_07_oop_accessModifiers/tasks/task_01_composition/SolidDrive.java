package lesson_07_oop_accessModifiers.tasks.task_01_composition;

public class SolidDrive {
    //Fields
    private String brand;
    private int capacity;

    //Constructor

    public SolidDrive(String brand, int capacity) {
        this.brand = brand;
        this.capacity = capacity;
    }

    //Getters and Setters


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    //toString()


    @Override
    public String toString() {
        return "SolidDrive{" +
                "brand='" + brand + '\'' +
                ", capacity=" + capacity +
                '}';
    }

}
