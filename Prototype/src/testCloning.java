import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

/**
 * Created by Mitch on 10/25/2015.
 */
public class testCloning {

    public static void main(String[] args){

        CloneFactory animalMaker = new CloneFactory();

        Sheep sally = new Sheep();

        Sheep clonedSheep = (Sheep) animalMaker.getClone(sally);
        Sheep clonedSheep2 = (Sheep) sally.makeCopy();       //without cloneFactory

        System.out.println(sally);
        System.out.println(clonedSheep);
        System.out.println(clonedSheep2);
        System.out.println("Sally Hashcode: " + System.identityHashCode(System.identityHashCode(sally)));
        System.out.println("Dolly Hashcode: " + System.identityHashCode(System.identityHashCode(clonedSheep)));
        System.out.println("Dolly2 Hashcode, without cloneFactory: " + System.identityHashCode(System.identityHashCode(clonedSheep2)));

    }
}
