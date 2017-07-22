/**
 * Created by Mitch on 11/21/2015.
 */
public class StockObserver implements Observer {

    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    private static int observerIDTracker = 0;

    private int observerID;

    private Subject stockGrabber;

    public StockObserver( Subject stockGrabber ){

        this.stockGrabber = stockGrabber;
        this.observerID = ++observerIDTracker;

        System.out.println("New Observer " + this.observerID);

        stockGrabber.register(this);

    }

    @Override
    public void update(double ibmPrice, double aaplPrice, double googPrice) {

        this.ibmPrice = ibmPrice;
        this.aaplPrice = aaplPrice;
        this.googPrice = googPrice;

        printPrices();
    }

    public void printPrices(){
        System.out.println(observerID + "\nIBM: " + ibmPrice +
            "\nAAPL: " + aaplPrice + "\nGOOG: " + googPrice + "\n");
    }
}
