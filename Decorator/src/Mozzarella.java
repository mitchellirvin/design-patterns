/**
 * Created by Mitch on 10/25/2015.
 */
public class Mozzarella extends ToppingDecorator {

    public Mozzarella(Pizza newPizza){

        super(newPizza);

        System.out.println("Adding Mozzarella");

    }

    public String getDescription(){
        return tempPizza.getDescription() + ", Mozzarella";
    }

    public double getCost(){
        return tempPizza.getCost() + .50;
    }

}
