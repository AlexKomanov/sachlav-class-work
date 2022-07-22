package lesson_09_exceprions.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ControlledExceptionTryCatch {
    public static void main(String[] args){

        FileReader fileReader;

        File file = new File("D://file.txt");
        try {
            fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            fileReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
