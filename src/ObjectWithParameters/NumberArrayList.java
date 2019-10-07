package ObjectWithParameters;

import java.util.ArrayList;

public class NumberArrayList {

    public static void main(String[]args){

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(4);
        numbers.add(8);

        numbers.remove(Integer.valueOf(4));

        System.out.println(numbers);
    }

}
