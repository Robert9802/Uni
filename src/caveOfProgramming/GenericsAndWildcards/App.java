package caveOfProgramming.GenericsAndWildcards;

import java.util.ArrayList;

public class App {

    public static void main(String[]args){

        ArrayList<String> list = new ArrayList<>();

        list.add("one");
        list.add("two");
        showList(list);
    }

    public static void showList(ArrayList<String> list){

        for(String value : list){
            System.out.println(value);

        }
    }
}
