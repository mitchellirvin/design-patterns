/**
 * Created by Mitch on 10/20/2015.
 */
import java.util.ArrayList;
public class valueVisitor implements Visitor {

    double evaluated;
    double bottom = 0;

    public valueVisitor(){
    }

    public void visitAddition(Addition a){
        ArrayList<Composite> components = a.getComponents();
        for(int i = 0; i < components.size(); i++){
            if(components.get(components.size()-1).getValue() != 10000){
                bottom = components.get(0).getValue();
                for(int j = 1; j < components.size(); j++){
                    bottom += components.get(j).getValue();
                }
                components.get(i).accept(this);
            }
            else if(bottom == 0){
                components.get(i).accept(this);
            }
            else{
                evaluated = bottom;
                evaluated += components.get(i).getValue();
            }
        }
    }
    public void visitSubtraction(Subtraction s){
        ArrayList<Composite> components = s.getComponents();
        for(int i = 0; i < components.size(); i++){
            if(components.get(components.size()-1).getValue() != 10000){
                bottom = components.get(0).getValue();
                for(int j = 1; j < components.size(); j++){
                    bottom -= components.get(j).getValue();
                }
                components.get(i).accept(this);
            }
            else if(bottom == 0){
                components.get(i).accept(this);
            }
            else{
                evaluated = bottom;
                evaluated -= components.get(i).getValue();
            }
        }
    }
    public void visitMultiplication(Multiplication m){
        ArrayList<Composite> components = m.getComponents();
        for(int i = 0; i < components.size(); i++){
            if(components.get(components.size()-1).getValue() != 10000){
                bottom = components.get(0).getValue();
                for(int j = 1; j < components.size(); j++){
                    bottom *= components.get(j).getValue();
                }
                components.get(i).accept(this);
            }
            else if(bottom == 0){
                components.get(i).accept(this);
            }
            else{
                evaluated = bottom;
                evaluated *= components.get(i).getValue();
            }
        }
    }
    public void visitDivision(Division d){
        ArrayList<Composite> components = d.getComponents();
        for(int i = 0; i < components.size(); i++){
            if(components.get(components.size()-1).getValue() != 10000){
                bottom = components.get(0).getValue();
                for(int j = 1; j < components.size(); j++){
                    bottom /= components.get(j).getValue();
                }
                components.get(i).accept(this);
            }
            else if(bottom == 0){
                components.get(i).accept(this);
            }
            else{
                evaluated = bottom;
                evaluated /= components.get(i).getValue();
            }
        }
    }
    public void visitOperand(Operand o){
        o.getValue();
    }
    public double getEvaluated(){
        return evaluated;
    }
    public String toString(){
        return "" + evaluated;
    }
}
