package Methods;

import java.util.Scanner;

public class returnvalues {

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int number = alwaysReturnTen();

        System.out.println(number);
        System.out.println("The number is" + sum(2,5));

        System.out.println("Type the first number");

        int first = Integer.parseInt(scanner.nextLine());
        System.out.println("Type the second number");

        int second = Integer.parseInt(scanner.nextLine());

        System.out.println("Total" + add(first,second));
    }
public static int alwaysReturnTen(){
        return 10;
}

public static int sum (int first, int second){
        return first + second;
}
public static int add(int first, int second){

        return first+second;
}
}
