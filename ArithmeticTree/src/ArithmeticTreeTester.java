/**
 * Created by Mitch on 10/20/2015.
 */
public class ArithmeticTreeTester {

    public static void main(String args[]){

        System.out.println("Program Starting! ");
        Composite mult = new Multiplication( new Operand( 9 ), new Operand( 11 ) );
        Composite add = new Addition( new Operand( 3 ), new Operand( 2 ), mult );
        Composite div = new Division( new Operand( 1 ), add );

/*        mult.displayComposite();
        System.out.println("---------------------");
        add.displayComposite();
        System.out.println("---------------------");
        div.displayComposite();
        System.out.println("---------------------");*/

        Visitor v = new infixVisitor();
        div.accept(v);
        System.out.println("");
        Visitor v1 = new lispVisitor();
        div.accept(v1);
        System.out.println("");
        Visitor v2 = new valueVisitor();
        div.accept(v2);
        System.out.println(v2);

    }
}
