package caveOfProgramming.Interfaces;

public class Person {

    private String name;

    public Person(String name){
        this.name=name;
    }

    public void greet(){
        System.out.println("Dave said hello");
    }

    public void showInfo(){
        System.out.println("The name of the person is" + name);
    }

}
