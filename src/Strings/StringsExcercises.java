package Strings;

import java.util.Scanner;

public class StringsExcercises {

    public static void main(String[]args){

        System.out.println("Please your name");

        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        char character = word.charAt(-1);

        System.out.println("The length of the nme is" + word.length());
        System.out.println("1st character of the word is" + character);
    }

}
