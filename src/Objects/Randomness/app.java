package Objects.Randomness;

import java.util.Random;

public class app {

    public static void main(String[]args){

        Random randomizer =  new Random();
        int i=0;

        while(i<10){
            System.out.println(randomizer.nextInt(10));
            i++;
        }
    }

}
