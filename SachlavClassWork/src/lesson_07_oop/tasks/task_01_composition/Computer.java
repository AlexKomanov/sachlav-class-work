package lesson_07_oop.tasks.task_01_composition;

import java.util.Arrays;

public class Computer {
    private double price;
    private GraphicCard graphicCard;
    private Chip chip;
    private SolidDrive solidDrive;
    private Memory[] memories;

    //Constructor

    public Computer(double price, GraphicCard graphicCard, Chip chip, SolidDrive solidDrive, Memory[] memories) {
        this.price = price;
        this.graphicCard = graphicCard;
        this.chip = chip;
        this.solidDrive = solidDrive;
        this.memories = memories;
    }

    //Getters and Setters

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public GraphicCard getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(GraphicCard graphicCard) {
        this.graphicCard = graphicCard;
    }

    public Chip getChip() {
        return chip;
    }

    public void setChip(Chip chip) {
        this.chip = chip;
    }

    public SolidDrive getSolidDrive() {
        return solidDrive;
    }

    public void setSolidDrive(SolidDrive solidDrive) {
        this.solidDrive = solidDrive;
    }

    public Memory[] getMemories() {
        return memories;
    }

    public void setMemories(Memory[] memories) {
        this.memories = memories;
    }

    //toString()


    @Override
    public String toString() {
        return "Computer{" +
                "price=" + price +
                ", graphicCard=" + graphicCard +
                ", chip=" + chip +
                ", solidDrive=" + solidDrive +
                ", memories=" + Arrays.toString(memories) +
                '}';
    }
}
