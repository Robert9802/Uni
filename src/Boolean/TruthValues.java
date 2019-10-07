package Boolean;

public class TruthValues {

    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 5;

        boolean firstGreater = true;

        if (num1 <= num2) {
            firstGreater = false;

        }

        if (firstGreater == true) { // or it could be if(firstGreater)
            System.out.println("num1 is greater");
        } else {
            System.out.println("num1 was not greater");

            System.out.println("");

            if (firstGreater) {
                System.out.println("num1 was greater");
            } else {
                System.out.println("num1 was not greater");


                if (!firstGreater) {

                    System.out.println("Num1 was not greater");
                }

            }
        }
    }
}


