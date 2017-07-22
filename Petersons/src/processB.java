/**
 * Created by Mitch on 10/8/2015.
 */
public class processB implements Runnable {
    private Petersons pete;

    public processB(Petersons p)
    {
        pete = p;
    }


    public void run()
    {
        while(!Thread.interrupted())
        {
            System.out.println("Turn : \t" + pete.getTurn() + "\t Interested : " + pete.getInterested(0) + "\t" + pete.getInterested(1));
            System.out.println("Entering region B!");
            pete.enter_region(1);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {

            }
            System.out.println("Turn : \t" + pete.getTurn() + "\t Interested : " + pete.getInterested(0) + "\t" + pete.getInterested(1));
            System.out.println("Leaving region B!");
            pete.leave_region(1);

        }
    }

}
