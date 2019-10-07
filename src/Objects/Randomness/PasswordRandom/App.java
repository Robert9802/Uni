package Objects.Randomness.PasswordRandom;

public class App {

    public static void main(String[]args){
        PasswordRandom random = new PasswordRandom(10);

        System.out.println("Password" + "" + random.createPassword());

                int number=5;
        char symbol="abcdefghijklmnopqrstuvwzyx".charAt(number);


        System.out.println(symbol);
    }

}
