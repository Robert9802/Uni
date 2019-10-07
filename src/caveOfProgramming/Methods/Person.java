package caveOfProgramming.Methods;

public class Person {

    String name;
    int age;

    void speak(){
        System.out.println("My name is" + name);

    }

    int calculatorYearsToRetirenment(){

        int yearsLeft = 65-age;
        System.out.println(yearsLeft);

        return yearsLeft;
    }
}
