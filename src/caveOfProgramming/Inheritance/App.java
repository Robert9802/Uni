package caveOfProgramming.Inheritance;

public class App {

    public static void main(String[]args){

        Machine mach1= new Machine();

        mach1.start();
        mach1.stopped();

        Car car1 = new Car();

        car1.start();
        car1.wipeWindShield();
        //car1.stopped(); not working for some reason
    }

}
