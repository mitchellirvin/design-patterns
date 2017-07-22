/**
 * Created by Mitch on 10/3/2015.
 */
public class VariableComposite extends Composite {

    Composite value;
    String type;

    public VariableComposite(Composite newComposite){
        value = newComposite;
    }

    public void insert(Composite newComposite){
        if(value != null){
            value = newComposite;
        }
        else{
            System.out.println("VariableComposite is FULL");
        }
    }
    public void remove(Composite newComposite){
        value = null;
    }

    public String returnType(){
        return type;
    }
    public String toString(){
        return "VariableComposite containing \n\t" + value.toString();
    }

}
