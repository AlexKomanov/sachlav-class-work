package lesson_09_exceprions.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ControlledExceptionThrow {
    public static void main(String[] args) throws FileNotFoundException  {

        File file = new File("D://file.txt");
        FileReader fileReader = new FileReader(file);
//        fileReader.close(); // triggers IOException
    }
}
