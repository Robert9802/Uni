package caveOfProgramming.Methods.StaticAndFinal;

public class Thing {

    public String name;
    public static String description;
    public final static int Lucky_number=7;

    public static int count=0;

    public int id;

    public Thing(){
        id=count;
        count++;
    }

    public void showName(){
        System.out.println("object id:" + id + "," + description + ":" + name);
    }
public static void showInfo(){
        System.out.println(description);


}
}
