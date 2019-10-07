package Boolean;

import java.util.ArrayList;
import java.util.Scanner;

public class Exec3 {

    public static void main(String[] args) {
        Scanner scannner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(5);
        list.add(9);
        list.add(5);
        list.add(2);

        System.out.println("Type a number");

        int number = scannner.nextInt();
        if(moreThanOnce(list,number)) {
            System.out.println(number + " Appears more than once");
        }else{
            System.out.println(number+ " does not appear more than once");
        }


    }
public static boolean moreThanOnce (ArrayList<Integer> list, int number){
        boolean sameNumber=true;

        for (int numb:list){
            System.out.println(numb);

            if(list.contains(number)) {
                sameNumber = true;
            } else if(!list.contains(number)){
                sameNumber=false;
            }
        }
return sameNumber;
    }
}
