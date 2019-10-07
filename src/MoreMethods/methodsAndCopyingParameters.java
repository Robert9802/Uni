package MoreMethods;

public class methodsAndCopyingParameters {

    public static void main(String[]args){
        int number=1;

        number=addThree(number);
        System.out.println(number);

    }

    public static int addThree(int number){
        number = number+3;

        return number;
    }
}
