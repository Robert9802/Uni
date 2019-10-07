package caveOfProgramming.Generics;

import java.util.ArrayList;

public class app {

    public static void main(String[]args){

        ArrayList<String> lists = new ArrayList<>();

        lists.add("Kinga");
        lists.add("Dave");
        lists.add("Caspar");
        lists.add("Sam");

        System.out.println(lists.get(1));
    }

}
