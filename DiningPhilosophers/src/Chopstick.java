/**
 * Created by Mitch on 10/12/2015.
 */

public class Chopstick
{
    private final int id;
    private Philosopher heldBy = null;

    public Chopstick( int id )
    {
        this.id = id;
    }

    public String toString()
    {
        return "chopstick (" + id + ")";
    }

    synchronized public boolean pickUp(Philosopher p)
    {
        if(heldBy == null) {
            heldBy = p;
            return true;
        }
        else if(heldBy == p)
            return true;
        else {
            return false;
        }
    }

    synchronized public void putDown(Philosopher p)
    {
        if(heldBy == p){
            heldBy = null;
            notifyAll();
            return;
        }
        else{
            throw new RuntimeException( "Exception: " + p.getPName() + " attempted to put " +
                    "down a chopstick he wasn't holding." );
        }

    }

    public Philosopher getHeldBy(){
        return heldBy;
    }
}

