/**
 * Created by Mitch on 10/3/2015.
 */
public class Leaf extends ArrayComposite {

    String name;

    public Leaf(String name){
        this.name = name;
    }

    public String getName() { return name; }

    @Override
    public String toString(){ return name; }

    public String toString(int tab) { return "Leaf " + name; }
}
