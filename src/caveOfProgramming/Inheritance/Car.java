package caveOfProgramming.Inheritance;

import caveOfProgramming.GenericsAndWildcards.Machine;

public class Car extends Machine { //car is a machine. Car is the same as machine

    @Override  //override method, checks it ovverides method in parent class.

    public void start(){
        System.out.println("Car started");
    }

    public void wipeWindShield(){
        System.out.println("Whipped");

    }
}
