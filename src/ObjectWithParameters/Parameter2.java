package ObjectWithParameters;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Parameter2 {

    public static void print(ArrayList<String> printed){
        for (String word:printed){
            System.out.println(word);
        }
    }

    public static void main(String[]args){
        ArrayList<String> programmingLanguages= new ArrayList<>();

        programmingLanguages.add("Java");
        programmingLanguages.add("Ruby");
        programmingLanguages.add("Python");
        programmingLanguages.add("C++");

        ArrayList<String> countries = new ArrayList<>();
        countries.add("Poland");
        countries.add("France");
        countries.add("Wales");

        print(programmingLanguages); //method is given the list programmingLanguages as a parameter

        System.out.println("");

        print(countries);

    }

}
