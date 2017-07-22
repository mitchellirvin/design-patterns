import java.util.ArrayList;

/**
 * Created by Mitch on 10/20/2015.
 */
public class Composite implements Visitable{

    public void insert(Composite newComposite){
        throw new UnsupportedOperationException();
    }
    public void remove(Composite newComposite){
        throw new UnsupportedOperationException();
    }
    public ArrayList getComponents(){
        throw new UnsupportedOperationException();
    }
    public String returnType() { throw new UnsupportedOperationException(); }
    public void displayComposite(){
        throw new UnsupportedOperationException();
    }
    public int getValue(){
        throw new UnsupportedOperationException();
    }
    public void accept(Visitor v){
        throw new UnsupportedOperationException();
    }
}
