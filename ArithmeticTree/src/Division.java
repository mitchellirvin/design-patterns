import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Mitch on 10/20/2015.
 */
public class Division extends Composite {

    String typeOfComposite;

    ArrayList<Composite> composites = new ArrayList();

    public Division(Composite... newComposite){

        for(Composite c : newComposite){
            insert(c);
        }
    }

    public void insert(Composite newComposite){

        composites.add(newComposite);
    }
    public void remove(Composite newComposite){

        composites.remove(newComposite);
    }
    public Composite getComposite(int compositeIndex){

        return (Composite)composites.get(compositeIndex);
    }
    public String returnType(){
        return typeOfComposite;
    }
    public void displayComposite(){

        System.out.println("Division: ");
        Iterator compositeIterator = composites.iterator();
        while(compositeIterator.hasNext()){
            Composite compositeInfo = (Composite) compositeIterator.next();

            compositeInfo.displayComposite();
        }
    }
    public int getValue() { return 10000; }
    public ArrayList getComponents(){
        return composites;
    }

    public void accept(Visitor v){
        v.visitDivision(this);
    }
}
