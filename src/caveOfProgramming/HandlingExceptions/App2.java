package caveOfProgramming.HandlingExceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App2 {

    public static void main(String[]args){

        File file = new File("test.txt");

        try{
            FileReader fr = new FileReader(file);
            System.out.println("Continuing...");
        } catch (FileNotFoundException e){
            System.out.println("File not found:" + file.toString());
        }
    }


}

