package lesson_07_oop.composition;

public class Wheel {

    private int radius;
    private double pressure;

    //Constructor
    public Wheel(int radius, double pressure) {
        this.radius = radius;
        this.pressure = pressure;
    }

    //Getters and setters
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    //toString
    @Override
    public String toString() {
        return "Wheel{" +
                "radius=" + radius +
                ", pressure=" + pressure +
                '}';
    }


}
