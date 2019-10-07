package Methods;

import java.util.Scanner;

public class ExcerciseMethod1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter thee 1st number");
        int number1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Type the second number");
        int number2 = Integer.parseInt(scanner.nextLine());
        System.out.println("smaller number is" + least(number1, number2));

    }

    public static int least(int number1, int number2) {
        if (number1 > number2) {
            return number2;
        } else {
            return number1;
        }
    }
}
