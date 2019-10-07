package Strings;

public class Length {

    public static void main(String[]args){

        String banana="banana";
        String cucumber= "cucumber";
        String together = banana+cucumber;

        System.out.println("The length of banana is" + banana.length());
        System.out.println("The length of cucumber is" + cucumber.length());
        System.out.println("The word of" + together + "is" + banana.length());

        String word ="Supercalifragilisticexpialidoious";

        char character = word.charAt(3);

        System.out.println("The 4th character of the word is" + character); //prints e

    }

}
