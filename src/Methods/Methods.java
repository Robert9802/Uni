package Methods;

public class Methods {

    public static void main(String[]args){

        int number=1;

        System.out.println("Main program variable number holds the value" + number);
        addThree(number);
        System.out.println("Main program variable number holds the value" + number);
    }

    public static void addThree (int number){
        System.out.println("method parameter  number holds the value" + number);
        number=number+3;

        System.out.println("method parameter  number holds the value" + number);


    }
}
