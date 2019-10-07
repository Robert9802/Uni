package ObjectWithParameters;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Exec4 {

    public static void main(String[]args){

        ArrayList<String> brothers = new ArrayList<>();
        brothers.add("Dick");
        brothers.add("Mick");
        brothers.add("Sick");
        brothers.add("Pick");

        Collections.sort(brothers);

        //remove the last

        removeLast(brothers);
        System.out.println(brothers);
    }

    public static void removeLast(ArrayList<String> list){
        list.remove(list.size()-1);
    }

}
