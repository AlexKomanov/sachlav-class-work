package lesson_07_oop.tasks.task_01_composition;

public class Chip {

    //Fields
    private String brand;
    private long frequency;
    private int generation;

    //Constructor

    public Chip(String brand, long frequency, int generation) {
        this.brand = brand;
        this.frequency = frequency;
        this.generation = generation;
    }

    //Getters and Setters

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public long getFrequency() {
        return frequency;
    }

    public void setFrequency(long frequency) {
        this.frequency = frequency;
    }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    //toString()

    @Override
    public String toString() {
        return "Chip{" +
                "brand='" + brand + '\'' +
                ", frequency=" + frequency +
                ", generation=" + generation +
                '}';
    }
}
