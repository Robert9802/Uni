package Class.Excercises;

public class DecreasingCounter {

    private int value;

    public DecreasingCounter(int valueAtStart){
        this.value=valueAtStart;
    }

    public void printValue(){
        System.out.println("value" + this.value);
    }

    public void decrease(){
        if(value==0){
            return;
        }
    this.value--;
    }
public int reset(){
        return this.value=0;
}
public int increase(){
        return this.value++;
}
}
