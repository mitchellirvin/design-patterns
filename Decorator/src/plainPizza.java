import java.nio.channels.Pipe;

/**
 * Created by Mitch on 10/25/2015.
 */
public class plainPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Thin Dough";
    }

    @Override
    public double getCost() {
        return 4.00;
    }
}
