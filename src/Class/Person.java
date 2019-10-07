package Class;

public class Person {

    private String name;
    private int age;

    public String toString() {
        return this.name + ", age" + this.age + " years";
    }


    public String getName(){
        return this.name;

    }

    public Person (String nameAtStart){
        this.age=3;
        this.name= nameAtStart;
    }
public void printPerson(){
        System.out.println(this.name+ " , age" + this.age + " years");
}
public void becomeOlder(){
        this.age++;
}
public int getAge(){
        return this.age;
}

public boolean isAdult(){
        if(this.age<18){
            return false;
        }
return true;
    }

}


/* Note that the method should could also be written like this:

public boolean is adult(){
return this.age >=18;
 */