/**
 * Created by Mitch on 10/20/2015.
 */
public class Operand extends Composite{

    int value;

    public Operand(int value){
        this.value = value;
    }

    public int getValue() { return value; }

    public void displayComposite(){ System.out.println("\t" + value); }

    public void accept(Visitor v){
        v.visitOperand(this);
    }

}
