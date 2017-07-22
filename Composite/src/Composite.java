/**
 * Created by Mitch on 10/3/2015.
 */
public abstract class Composite {

    public void insert(Composite newComposite){
        throw new UnsupportedOperationException();
    }
    public void remove(Composite newComposite){
        throw new UnsupportedOperationException();
    }
    public Composite getComposite(int compositeIndex){
        throw new UnsupportedOperationException();
    }
    public String getCompositeName(){
        throw new UnsupportedOperationException();
    }
    public String getLeafName(){
        throw new UnsupportedOperationException();
    }

    public String returnType() { throw new UnsupportedOperationException(); }
    public String toString(){
        throw new UnsupportedOperationException();
    }
    public String toString(int tab){
        throw new UnsupportedOperationException();
    }
}
