import sun.plugin.com.event.COMEventHandler;

/**
 * Created by Mitch on 10/4/2015.
 */
public class CompositeTester {

    public static void main(String[] args){
        Composite lc = new LinkedComposite( new Leaf( "A" ), new Leaf( "B" ) );
        Composite ac = new ArrayComposite( new Leaf( "C" ), lc, new Leaf( "D" ) );
        System.out.println(lc.toString() + "\n");
        System.out.println(ac.toString() + "\n");
        Composite ac1 = new ArrayComposite(new Leaf( "E" ), new Leaf( "F" ));
        System.out.println(ac1.toString() + "\n");

        Composite lc1 = new LinkedComposite( new Leaf( "G" ), ac, new Leaf( "H" ) );
        System.out.println(lc1.toString() + "\n");

        Composite ac2 = new ArrayComposite(new Leaf( "E" ), lc, ac, new Leaf( "F" ));
        System.out.println(ac2.toString() + "\n");

        Composite lc2 = new LinkedComposite( new Leaf( "G" ), ac, new Leaf( "H" ) );
        System.out.println(lc2.toString() + "\n");

        Composite vc = new VariableComposite( new Leaf( "V" ));
        System.out.println(vc.toString());

    }

}
