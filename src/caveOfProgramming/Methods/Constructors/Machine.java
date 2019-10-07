package caveOfProgramming.Methods.Constructors;

public class Machine {

    private String name;
    private int code;

    public Machine(){
        this("Arnie", 0); //calling 3rd method
        System.out.println("Constructor running");
        name = " Arnie";
    }

    public Machine(String name){
        this.name=name;
    }
public Machine(String name, int code){
        System.out.println("Third Consctructor running");
        this.name=name;
        this.code=code;
}

}
