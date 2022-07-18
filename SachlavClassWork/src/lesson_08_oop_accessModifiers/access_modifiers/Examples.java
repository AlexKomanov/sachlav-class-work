package lesson_08_oop_accessModifiers.tasks.task_01_polymorphism_inheritance.ddddd.access_modifiers;

public class Examples {

    public int number = 8;
    private int privateNumber = 9;
    int defaultNumber = 10;
    protected int protectedNumber = 200;

    public static int staticNumber = 500;
    public final int FINAL_NUMBER = 6;
    public final int finalNumber = 6;


    public int getPrivateNumber() {
        return privateNumber;
    }


    public void setPrivateNumber(int privateNumber) {
        if(privateNumber < 0) {
            this.privateNumber = 5;
        }
        else {
            this.privateNumber = privateNumber;
        }

    }
}
