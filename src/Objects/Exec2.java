package Objects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exec2 {

    public static void main(String[]args){
        ArrayList<String> name = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        int i = 0;

        while(i<5){
            name.add(word);
            System.out.println("Type a word");
            word=scanner.nextLine();
            Collections.reverse(name);
            i++;
        }
   for(String alp: name){
       System.out.println(alp);
   }
    }

}
