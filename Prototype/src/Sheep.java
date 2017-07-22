/**
 * Created by Mitch on 10/25/2015.
 */
public class Sheep implements Animal {

    public Sheep(){
        System.out.println("Sheep is made. ");
    }

    @Override
    public Animal makeCopy() {

        System.out.println("Sheep copy being made. ");
        Sheep sheepObject = null;

        try {
            sheepObject = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return sheepObject;
    }

    public String toString(){
        return "Dolly is my hero, baahahahhha";
    }

}
