/**
 * Created by Mitch on 10/3/2015.
 */
public class Node{

    Node next;
    Composite value;
    public String type = "LinkedComposite";

    public Node(Composite newComposite){
        next = null;
        value = newComposite;
    }

    public Node(Composite newComposite, Node next){
        value = newComposite;
        this.next = next;
    }

    public Composite getValue(){
        return value;
    }

    public void setValue(Composite newComposite){
        value = newComposite;
    }

    public Node getNext(){
        return next;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public String returnType(){
        return type;
    }
}
