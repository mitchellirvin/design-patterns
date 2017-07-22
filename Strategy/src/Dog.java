/**
 * Created by Mitch on 9/28/2015.
 */
public class Dog extends Animal {
    public void digHole(){
        System.out.println("Dug a hole!");
    }

    public Dog(){
        super();

        setSound("Bark");

        flyingType = new CantFly();
    }
}
