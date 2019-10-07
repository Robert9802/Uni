package Objects;

import java.util.ArrayList;

public class One {

    public static void main(String[] args) {
        ArrayList<String> teachers = new ArrayList<>();
        teachers.add("Antony");
        teachers.add("Bart");
        teachers.add("Paul");
        teachers.add("John");
        teachers.add("Martin");
        teachers.add("Matt");

        System.out.println("The number of teachers" + teachers.size());
        System.out.println("First teacher on the list" + teachers.get(0));
        System.out.println("Third teacher on the list" + teachers.get(2));

        teachers.remove("bart");
        if (teachers.contains("bart")) {
            System.out.println("Bart is on the teacher list");
        } else {
            System.out.println("Bart is not on the teacher list");

        }

    }
}