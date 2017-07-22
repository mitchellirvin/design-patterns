/**
 * Created by Mitch on 10/20/2015.
 */
import java.util.ArrayList;
public class lispVisitor implements Visitor {

    public lispVisitor(){
    }

    public void visitAddition(Addition a){
        ArrayList<Composite> components = a.getComponents();
        System.out.print("(");
        System.out.print("+");
        for(int i = 0; i < components.size(); i++){
            if(components.get(i).getValue() == 10000){
                components.get(i).accept(this);
                System.out.print(")");
            }
            else{
                components.get(i).accept(this);
            }
        }
    }
    public void visitSubtraction(Subtraction s){
        ArrayList<Composite> components = s.getComponents();
        System.out.print("(");
        System.out.print("-");
        for(int i = 0; i < components.size(); i++){
            if(components.get(i).getValue() == 10000){
                components.get(i).accept(this);
                System.out.print(")");
            }
            else{
                components.get(i).accept(this);
            }
        }
    }
    public void visitMultiplication(Multiplication m){
        ArrayList<Composite> components = m.getComponents();
        System.out.print("(");
        System.out.print("*");
        for(int i = 0; i < components.size(); i++){
            if(components.get(i).getValue() == 10000){
                components.get(i).accept(this);
                System.out.print(")");
            }
            else{
                components.get(i).accept(this);
            }
        }
    }
    public void visitDivision(Division d){
        ArrayList<Composite> components = d.getComponents();
        System.out.print("(");
        System.out.print("/");
        for(int i = 0; i < components.size(); i++){
            if(components.get(i).getValue() == 10000){
                components.get(i).accept(this);
                System.out.print(")");
            }
            else{
                components.get(i).accept(this);
            }
        }
    }
    public void visitOperand(Operand o){
        System.out.print(" " + o.getValue() + " ");
    }
}
