package Class.moreMethods;

public class Person {

    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String initiaName){
        this.age=0;
        this.name= initiaName;
        this.weight=0;
        this.height=0;
    }

    public void setHeight(int newHeight){
        this.height= newHeight;
    }
public void setWeight(int newWeight){
        this.weight = newWeight;
}

public double bodyMassIndex(){

        double heightDividedByHundred= this.height/100.0;
        return this.weight/ (heightDividedByHundred * heightDividedByHundred);
}
public String getName(){
        return name;
}

public String toString(){
        return this.name + "age" + this.age + "years, my body mass index is" + this.bodyMassIndex();
}

}
