/**
 * Created by Mitch on 9/28/2015.
 */
public class Bird extends Animal {

    public Bird(){
        super();

        setSound("Tweet");

        flyingType = new ItFlys();
    }

}
