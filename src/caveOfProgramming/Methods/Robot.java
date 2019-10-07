package caveOfProgramming.Methods;

public class Robot {

    public void speak(String text){
        System.out.println("hello");

    }

    public void jump(int height){
        System.out.println("Jumping" + height);

    }

    public void moved(String direction, double distance){
        System.out.println("Moving" + distance+ " in direciton" + direction);
    }
}
