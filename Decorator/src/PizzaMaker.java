/**
 * Created by Mitch on 10/25/2015.
 */
public class PizzaMaker {

    public static void main(String[] args){

        Pizza basicPizza = new Pepperoni(new Mozzarella(new TomatoSauce(new plainPizza())));

        System.out.println("Ingredients: " + basicPizza.getDescription());

        System.out.println("Cost: $" + basicPizza.getCost());

    }

}
