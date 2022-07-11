package lesson_07_oop_accessModifiers.tasks.task_01_composition;

public class MyComputers {
    public static void main(String[] args) {

        Chip chip = new Chip("Intel", 1230, 12);
        GraphicCard graphicCard = new GraphicCard(1250, "Nvidia");
        SolidDrive solidDrive = new SolidDrive("Seagate", 2000);
        Memory[] memory = {
                new Memory(12, "Kingston"),
                new Memory(12, "Kingston"),
                new Memory(12, "Kingston"),
                new Memory(12, "Kingston"),
        };

        Computer computer = new Computer(345435.456, graphicCard, chip, solidDrive, memory);
        Computer computer2 = new Computer(1000.678, graphicCard, chip, solidDrive, memory);

        System.out.println(computer);
        System.out.println(computer2);
    }
}
