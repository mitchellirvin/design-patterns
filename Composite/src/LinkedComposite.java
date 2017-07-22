/**
 * Created by Mitch on 10/3/2015.
 */
public class LinkedComposite extends Composite {

    private Node head;
    private int lengthOfList;
    public String type = "LinkedComposite";

    public LinkedComposite(Composite... values){

        head = new Node(null);
        lengthOfList = 0;
        for(Composite c : values){
            insert(c);
        }
    }

    public void insert(Composite value){

        Node tempNode = new Node(value);
        Node currentNode = head;

        while( currentNode.getNext() != null){
            currentNode = currentNode.getNext();
        }

        currentNode.setNext(tempNode);
        lengthOfList++;
    }

    public int length(){
        return lengthOfList;
    }

    public void remove(Composite newComposite){
        if(lengthOfList == 0) {
            System.out.println("LinkedComposite is EMPTY ");
            return;
        }
        Node currentNode = head;
        for(int i=0; i < lengthOfList; i++){
            if(currentNode.getValue() == newComposite)
                break;
            currentNode = currentNode.getNext();
        }

        currentNode.setNext(currentNode.getNext().getNext());
        lengthOfList--;
    }

    public Composite getComposite(int index){
        if(index <= 0) return null;

        Node currentNode = head.getNext();
        for(int i=1; i < index; i++){
            if( currentNode.getNext() == null){
                return null;
            }
            currentNode = currentNode.getNext();
        }

        return currentNode.getValue();
    }

    public String returnType(){
        return type;
    }

    public String toString(){
        Node currentNode = head.getNext();
        String newStr = "LinkedComposite containing ";
        int tab = 1;
        if(type != currentNode.getNext().returnType()){
            tab++;
        }
        while(currentNode.getNext() != null){
            newStr += "\n\t" + currentNode.getValue().toString(tab);
            if(type != currentNode.getNext().getValue().returnType()){
                tab++;
            }
            currentNode = currentNode.getNext();
        }
        newStr += "\n\t" + currentNode.getValue().toString(tab);
        return newStr;
    }
    public String toString(int tab){
        Node currentNode = head.getNext();
        String newStr = "LinkedComposite containing ";
        String tabs = "";
        for(int i=tab; i>0; i--){
            tabs += "\t";
        }
        while(currentNode != null){
            newStr += "\n" + tabs + currentNode.getValue().toString(tab);
            currentNode = currentNode.getNext();
        }

        return newStr;
    }
}
