package caveOfProgramming.GenericsAndWildcards;

import java.util.ArrayList;

public class App2 {

    public static void main(String[]args){
        ArrayList<Machine> lists = new ArrayList<>();

        lists.add(new Machine());
        lists.add(new Machine());

        ArrayList<Camera> lists2 = new ArrayList<>();

        lists2.add(new Camera());
        lists2.add(new Camera());
        showList(lists);
    }
public static void showList(ArrayList<? extends Machine> lists){
        //for (Object value: lists){
    //System.out.println(value);

    for (Machine value: lists){

        System.out.println(value);
    }
}
}
