/**
 * Created by Mitch on 10/12/2015.
 */
import java.util.Random;

public class Philosopher extends Thread
{
    static private Random random = new Random();

    private String name;                //philosopher's name
    private Chopstick leftStick;        //chopstick to their left ( index of phil. - 1 == chopstick ID )
    private Chopstick rightStick;       //chopstick to their right ( index of phil == chopstick ID )

    private int eatingTime   = 0;
    private int thinkingTime = 0;
    private int countEat     = 0;
    private int countThink   = 0;

    public Philosopher( String name, Chopstick leftStick, Chopstick rightStick )
    {
        this.name = name;
        this.leftStick = leftStick;
        this.rightStick = rightStick;
    }

    public String toString()
    {
        return name + " ate " + countEat + " times (" +
                eatingTime + "ms) and pondered " + countThink + " times (" +
                thinkingTime + "ms)";
    }

    public void run()
    {
        /********* YOUR CODE GOES HERE **********/
        while(!Thread.interrupted()) {
            try {
                countThink++;
                thinkingTime += doAction("think");
                pickupChopsticks();
            }
            catch(InterruptedException e){
                return;
            }
            try {
                countEat++;
                eatingTime += doAction("eat");
                putdownChopsticks();            //put em down after u done eatin boi
            } catch (InterruptedException e) {
                return;
            }
        }

        /********* YOUR CODE GOES HERE **********/
    }

    private int doAction( String act ) throws InterruptedException
    {
        int time = random.nextInt( 4000 ) + 1000;
        System.out.println( name + " is beginning to " + act + " for " + time +
                " milliseconds" );
        sleep(time);

        System.out.println( name + " is done " + act + "ing" );

        return time;
    }

    private void pickupChopsticks() throws InterruptedException
    {
    System.out.println( name + " wants right " + rightStick );      //print that he wants his right stick

    synchronized (rightStick) {
        while(!rightStick.pickUp(this)){            //while something else has this chopstick
            try {
                rightStick.wait();                  //wait
            }
            catch(InterruptedException e){
                e.getLocalizedMessage();
                return;
            }
        }

        rightStick.pickUp(this);                        //pick up the right stick
    }

    System.out.println(name + " has right " + rightStick);        //print that we've got the rightStick
    System.out.println(name + " wants left " + leftStick);        //print that we want the leftStick

    synchronized (leftStick) {
        if (!leftStick.pickUp(this)) {            //if something else has this chopstick
            rightStick.putDown(this);                                                   //put down the right
            System.out.println(name + " was unable to get the left " + leftStick);     //can't pick it up
            System.out.println(name + " politely returned right " + rightStick);      //must put down the right
            while(!leftStick.pickUp(this)){            //while something else has this chopstick
                try {
                    leftStick.wait();                  //wait
                }
                catch(InterruptedException e){
                    e.getLocalizedMessage();
                    return;
                }
            }
            pickupChopsticks();
        }
        else{
            leftStick.pickUp(this);                 //pick up the left stick because it is available
            System.out.println(name + " has both left " + leftStick +
                    " and right " + rightStick);                        //print that you have both chopsticks
            return;
        }
    }
}

    private synchronized void putdownChopsticks()
    {
        rightStick.putDown(this);
        System.out.println(name + " finished using right " + rightStick);

        leftStick.putDown(this);
        System.out.println(name + " finished using left " + leftStick);
    }

    public String getPName(){
        return name;
    }

}
