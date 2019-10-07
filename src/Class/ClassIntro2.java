package Class;

public class ClassIntro2 {

    public static void main(String[]args){
Person bob = new Person ("bob");
Person andy = new Person("Andy");

int i=0;

while(i<30){
    bob.becomeOlder();
    i++;

        }
    andy.becomeOlder();
System.out.println("");

if(andy.isAdult()){
    System.out.println(andy.getName()+ "is an adult");
    andy.printPerson();
} else {
    System.out.println(andy.getName() + "Minor");
    andy.printPerson();

    if(bob.isAdult()){
        System.out.println(bob.getName()+ " adult");
        bob.printPerson();
    } else {
        System.out.println(bob.getName() + " Minor");
        bob.printPerson();
    }
}


    }

}
