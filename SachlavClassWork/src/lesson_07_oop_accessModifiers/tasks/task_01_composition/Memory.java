package lesson_07_oop_accessModifiers.tasks.task_01_composition;

public class Memory {

    private int ramAmount;
    String brand;

    //Constructor

    public Memory(int ramAmount, String brand) {
        this.ramAmount = ramAmount;
        this.brand = brand;
    }

    //Getters and Setters

    public int getRamAmount() {
        return ramAmount;
    }

    public void setRamAmount(int ramAmount) {
        this.ramAmount = ramAmount;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    //toString()

    @Override
    public String toString() {
        return "Memory{" +
                "ramAmount=" + ramAmount +
                ", brand='" + brand + '\'' +
                '}';
    }
}
