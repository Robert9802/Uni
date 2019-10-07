
package UniWork;

public class Order {

    private double cost;
    private String item;

    public Order(String item){
        this.item= item;
        this.cost=0;


    }

   public String item(){
       return this.item;
    }

    public double cost(){
       return this.cost;
    }

}