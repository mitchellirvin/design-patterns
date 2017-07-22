/**
 * Created by Mitch on 10/8/2015.
 */
public class processA implements Runnable{
    private Petersons pete;

    public processA(Petersons p)
    {
        pete = p;
    }

    public void run()
    {
        while(!Thread.interrupted())
        {
            System.out.println("Turn : \t" + pete.getTurn() + "\t Interested : " + pete.getInterested(0) + "\t" + pete.getInterested(1));
            System.out.println("Entering region A!");
            pete.enter_region(0);
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e) {

            }
            System.out.println("Turn : \t" + pete.getTurn() + "\t Interested : " + pete.getInterested(0) + "\t" + pete.getInterested(1));
            System.out.println("Leaving region A!");
            pete.leave_region(0);

        }
    }
}
