package lesson_08_oop_accessModifiers_interfaces.tasks.task_02_interfaces;

import java.util.ArrayList;

public class PrintingClass {
    public static void main(String[] args) {

        Printable book_1 = new Book("Harry Potter");
        Printable book_2 = new Book("King of the Rings");
        Printable magazine_1 = new Magazine("Forbes");
        Printable magazine_2 = new Magazine("National Geographic");

        ArrayList<Printable> printableStaff = new ArrayList<>();

        printableStaff.add(book_1);
        printableStaff.add(book_2);
        printableStaff.add(magazine_1);
        printableStaff.add(magazine_2);

        printableStaff.forEach(x -> x.print());

    }
}
