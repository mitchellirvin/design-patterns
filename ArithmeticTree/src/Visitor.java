/**
 * Created by Mitch on 10/20/2015.
 */
public interface Visitor {

    public void visitAddition(Addition a);
    public void visitSubtraction(Subtraction s);
    public void visitMultiplication(Multiplication m);
    public void visitDivision(Division d);
    public void visitOperand(Operand o);

}
