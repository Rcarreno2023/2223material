public class GroceryItemRev0 {

    private String name;
    private double cost;

    public GroceryItemRev0(String name,double cost){
        this.name=name;
        this.cost=cost;
    }
    
    private void setName(String newName){
        this.name=newName;
    }
    private String getName(){
        return this.name;
    }
    public void setCost(double newCost){
        this.cost=newCost;
    }
    public double getCost(){
        return this.cost;
    }

    @Override
    public String toString(){
        return this.name + " - "+String.valueOf(this.cost);
    }

}