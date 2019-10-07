package Objects;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class two {

    public static void main(String[]args){

        ArrayList<String> teachers = new ArrayList<>();

        teachers.add("Anthony");
        teachers.add("Paul");
        teachers.add("John");
        teachers.add("Martin");

        System.out.println(teachers.get(0));
        System.out.println(teachers.get(1));
        System.out.println(teachers.get(2));
        System.out.println(teachers.get(3));

        System.out.println("");
        //---------------------------------------------//

        ArrayList<String> teacher = new ArrayList<>();

        teacher.add("Rob");
        teacher.add("Hollie");
        teacher.add("Kinga");
        teacher.add("Susan");
        teacher.add("Matt");

        int place =0;

        System.out.println(teacher.get(place));
        place++;
        System.out.println(teacher.get(place));
        place++;
        System.out.println(teacher.get(place));
        place++;
        System.out.println(teacher.get(place));
        place++;
        System.out.println(teacher.get(place));
        place++;

        System.out.println("");

        //----------------------------------------//

        ArrayList<String> Animals = new ArrayList<>();
        Animals.add("Pig");
        Animals.add("Seal");
        Animals.add("Cat");
        Animals.add("Dog");
        Animals.add("Rabbit");

        for(String animal: Animals){
            System.out.println(animal);
        }
    }

}
