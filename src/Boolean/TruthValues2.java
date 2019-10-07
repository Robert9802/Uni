package Boolean;

import java.util.ArrayList;

public class TruthValues2 {

    public static void main(String[]args){

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(-1);

        boolean result = allPositive(numbers);

        if(result){
            System.out.println("All numbers are positive");
        } else{
            System.out.println("There is at least one negative number");
        }
    }

    public static boolean allPositive(ArrayList<Integer> numbers){
        boolean noNegative=true;

        for(int number: numbers){
            if(number<0){
                noNegative = false;
            }
        }
    return noNegative;
    }

}
