/**
 * Created by Mitch on 10/25/2015.
 */
public class TomatoSauce extends ToppingDecorator{

    public TomatoSauce(Pizza newPizza){

        super(newPizza);

        System.out.println("Adding Sauce");

    }

    public String getDescription(){
        return tempPizza.getDescription() + ", TomatoSauce";
    }

    public double getCost(){
        return tempPizza.getCost() + .35;
    }

}
