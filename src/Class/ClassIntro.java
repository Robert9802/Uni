package Class;

public class ClassIntro {

    public static void main(String[]args){
        Person pekka = new Person ("Pekka");
        Person dave = new Person ("Dave");
        Person sam = new Person ("Dave");

        pekka.printPerson();
        dave.printPerson();
        sam.printPerson();

        System.out.println("");

        dave.becomeOlder();

        System.out.println("Age of Pekka" + pekka.getAge());
        System.out.println("Age of dave" + dave.getAge());

        int total = pekka.getAge()+dave.getAge();

        System.out.println("Pekka and Andrew total of" + total + " years old");
    }

}
