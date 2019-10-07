package Objects;

import java.util.ArrayList;
import java.util.Scanner;

public class Exec1 {

    public static void main(String[]args){

        ArrayList<String> words = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        while(!word.isEmpty()){
            words.add(word);
            System.out.println("type a word");
            word= scanner.nextLine();

        }

        System.out.println("You typed the following words");

        for (String alp: words);
        System.out.println(words);
    }


}
