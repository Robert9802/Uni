package caveOfProgramming.Methods;

public class App {

    public static void main(String[]args){

        Robot sam = new Robot();

        sam.speak("Hi I'am Sam");
        sam.jump(7);
        sam.moved("West", 2.5);

        int value =14;
        sam.jump(value);
    }

}
