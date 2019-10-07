package Objects.Randomness.PasswordRandom;

public class PasswordRandom {

    private int length;
    public static final String random ="ABCDEFGHIJKLMNOPQRSTUVWXYZfdsfesdefsdcsd1234567890";

            public PasswordRandom(int length){
        this.length=length;
            }

            public String createPassword(){
        return random;
            }

}
