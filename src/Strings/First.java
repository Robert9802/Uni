package Strings;

import java.util.Scanner;

public class First {

    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a word");
        String word = reader.nextLine();

        System.out.println("Lenngth of the first part");
        int length = Integer.parseInt(reader.nextLine());

        System.out.println("Results:" + word.substring(0,length));
    }

}
