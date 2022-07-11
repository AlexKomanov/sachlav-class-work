package lesson_07_oop_accessModifiers.tasks.task_01_composition;

public class GraphicCard {

    private long frequency;
    private String brand;

    //Constructor
    public GraphicCard(long frequency, String brand) {
        this.frequency = frequency;
        this.brand = brand;
    }

    //Getters and Setters

    public long getFrequency() {
        return frequency;
    }

    public void setFrequency(long frequency) {
        this.frequency = frequency;
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
        return "GraphicCard{" +
                "frequency=" + frequency +
                ", brand='" + brand + '\'' +
                '}';
    }
}
