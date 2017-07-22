/**
 * Created by Mitch on 10/20/2015.
 */
import java.util.ArrayList;
public class infixVisitor implements Visitor {

    public infixVisitor(){
    }

    public void visitAddition(Addition a){
        ArrayList<Composite> components = a.getComponents();
        for(int i = 0; i < components.size(); i++){
            if(components.get(i).getValue() == 10000){
                System.out.print("(");
                components.get(i).accept(this);
                System.out.print(")");
            }
            else if(i == components.size()-1){
                components.get(i).accept(this);
            }
            else{
                components.get(i).accept(this);
                System.out.print("+");
            }
        }
    }
    public void visitSubtraction(Subtraction s){
        ArrayList<Composite> components = s.getComponents();
        for(int i = 0; i < components.size(); i++){
            if(components.get(i).getValue() == 10000){
                System.out.print("(");
                components.get(i).accept(this);
                System.out.print(")");
            }
            else if(i == components.size()-1){
                components.get(i).accept(this);
            }
            else{
                components.get(i).accept(this);
                System.out.print("-");
            }
        }
    }
    public void visitMultiplication(Multiplication m){
        ArrayList<Composite> components = m.getComponents();
        for(int i = 0; i < components.size(); i++){
            if(components.get(i).getValue() == 10000){
                System.out.print("(");
                components.get(i).accept(this);
                System.out.print(")");
            }
            else if(i == components.size()-1){
                components.get(i).accept(this);
            }
            else{
                components.get(i).accept(this);
                System.out.print("*");
            }
        }
    }
    public void visitDivision(Division d){
        ArrayList<Composite> components = d.getComponents();
        for(int i = 0; i < components.size(); i++){
            if(components.get(i).getValue() == 10000){
                System.out.print("(");
                components.get(i).accept(this);
                System.out.print(")");
            }
            else if(i == components.size()-1){
                components.get(i).accept(this);
            }
            else{
                components.get(i).accept(this);
                System.out.print("/");
            }
        }
    }
    public void visitOperand(Operand o){
        System.out.print(" " + o.getValue() + " ");
    }

}
