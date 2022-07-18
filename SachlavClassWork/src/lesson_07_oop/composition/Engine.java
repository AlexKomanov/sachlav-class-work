package lesson_07_oop.composition;

public class Engine {

    private int year;
    private int horsePower;
    private int numberOfCylinders;

    //Constructor
    public Engine(int year, int horsePower, int numberOfCylinders) {
        this.year = year;
        this.horsePower = horsePower;
        this.numberOfCylinders = numberOfCylinders;
    }

    //Getters and Setters

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    /*******************
     ****  toString ****
     ******************/

    @Override
    public String toString() {
        return "Engine{" +
                "year=" + year +
                ", horsePower=" + horsePower +
                ", numberOfCylinders=" + numberOfCylinders +
                '}';
    }

}
