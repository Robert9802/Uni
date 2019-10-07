package ObjectWithParameters;

import java.util.ArrayList;

public class Exec3 {

    public static int countItems(ArrayList<String> list){
        return list.size();
    }
    public static void main (String[]args){

        ArrayList<String> list = new ArrayList<>();
        list.add("Moi");
        list.add("Ciao");
        list.add("Hello");
        System.out.println("There are this many items on the list:");
        //You can remove the coment from elow when the method is done.
        System.out.println(countItems(list));
    }

}
