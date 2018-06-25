/**
 * Created by Mitch on 10/12/2015.
 */

public class Chopstick {
    private final int id;
    private Philosopher heldBy;

    public Chopstick(int id) {
        this.id = id;
        this.heldBy = null; 
    }

    public String toString() {
        return "chopstick (" + id + ")";
    }

    public synchronized boolean pickUp(Philosopher p) {
        if (heldBy == null) {
            heldBy = p;
            return true;
        } else if (heldBy == p) {
            return true;
        } else {
            return false;
        }
    }

    public synchronized void putDown(Philosopher p) {
        if (heldBy == p) {
            heldBy = null;
            notifyAll();
            return;
        } else {
            throw new RuntimeException( "Exception: " + p.getPName() + " attempted to put " +
                    "down a chopstick he wasn't holding." );
        }
    }

    public Philosopher getHeldBy() {
        return heldBy;
    }
}
