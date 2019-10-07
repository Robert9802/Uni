package caveOfProgramming.Methods;

public class GettersAndReturnValue {

    public static void main(String[]args){

        Person person1 = new Person();

        person1.name="Joe";
        person1.age=25;

        person1.speak();
        int year = person1.calculatorYearsToRetirenment();

        System.out.println("Years till retirement" + year);
    }

}
