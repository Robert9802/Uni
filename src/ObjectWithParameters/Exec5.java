package ObjectWithParameters;

import java.util.ArrayList;

public class Exec5 {

    public static void main(String[]args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The sum:" + sum(list));

        list.add(10);

        System.out.println("The sum:" + sum(list));
    }

    public static int sum(ArrayList<Integer> list) {
        int sum =0;

        for (int item: list){
            sum+=item;
        }
    return sum;
    }
}
