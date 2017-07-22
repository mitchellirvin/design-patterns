/**
 * Created by Mitch on 10/20/2015.
 */
import java.util.ArrayList;
import java.util.Iterator;

public class Addition extends Composite {

    String typeOfComposite;

    ArrayList<Composite> composites = new ArrayList();

    public Addition(Composite... newComposite){

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
    public ArrayList getComponents(){
        return composites;
    }
    public String returnType(){
        return typeOfComposite;
    }
    public void displayComposite(){

        System.out.println("Addition: ");
        Iterator compositeIterator = composites.iterator();
        while(compositeIterator.hasNext()){
            Composite compositeInfo = (Composite) compositeIterator.next();

            compositeInfo.displayComposite();
        }
    }
    public int getValue() { return 10000; }

    public void accept(Visitor v){
        v.visitAddition(this);
    }

}
