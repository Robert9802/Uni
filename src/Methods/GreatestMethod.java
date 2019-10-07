package Methods;

import java.util.Scanner;

public class GreatestMethod {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter thee 1st number");
        int digit1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Type the second number");
        int digit2 = Integer.parseInt(scanner.nextLine());
        System.out.println("smaller number is" + greatest(digit1, digit2));

    }

    public static int greatest(int number1, int number2) {
        if (number1 < number2) {
            return number2;
        } else {
            return number1;
        }
    }
}



