package Class;

public class ClassIntro3 {

    public static void main(String[]args){
        Person bob = new Person("Bob");
        Person andy = new Person("Andy");

        int i=0;
        while(i<30){
            bob.becomeOlder();
            i++;

        }
    andy.becomeOlder();
        System.out.println(andy);
        System.out.println(bob);

    }

}
