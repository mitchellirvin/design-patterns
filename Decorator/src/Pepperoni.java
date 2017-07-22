/**
 * Created by Mitch on 10/25/2015.
 */
public class Pepperoni extends ToppingDecorator {

    public Pepperoni(Pizza newPizza) {
        super(newPizza);

        System.out.println("Adding Pepperoni ");
    }

    public String getDescription(){
        return tempPizza.getDescription() + ", Pepperoni";
    }

    public double getCost(){
        return tempPizza.getCost() + .75;
    }

}
