package caveOfProgramming.Interfaces;

public class App {

    public static void main(String[]args){
        Machine mach1= new Machine();

        mach1.start();

        Person person1= new Person("Dave");

        person1.greet();

        Info info1 = new Machine();

        info1.showInfo();

      // Info info2 = person1; not working

       // not working  info2.showInfo();

        System.out.println("");
        System.out.println("");

        outputInfo(mach1);
      // not working  outputInfo(person1);
    }

    private static void outputInfo(Info info){

        info.showInfo();
    }
}
