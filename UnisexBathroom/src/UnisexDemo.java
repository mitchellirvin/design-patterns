/**
 * Created by Mitch on 10/15/2015.
 */
public class UnisexDemo {

    public static void main( String[] arg ) {
        UnisexBathroom b = new UnisexBathroom();
        Thread w1 = new Thread(new Woman(b));
        Thread m1 = new Thread(new Man(b));
        Thread w2 = new Thread(new Woman(b));
        Thread m2 = new Thread(new Man(b));
        Thread w3 = new Thread(new Woman(b));
        Thread m3 = new Thread(new Man(b));
        Thread w4 = new Thread(new Woman(b));
        Thread m4 = new Thread(new Man(b));
        Thread w5 = new Thread(new Woman(b));
        Thread m5 = new Thread(new Man(b));
        Thread w6 = new Thread(new Woman(b));
        Thread m6 = new Thread(new Man(b));

        m1.start();
        w1.start();
        w2.start();
        m2.start();
        m3.start();
        w3.start();
        w4.start();
        m4.start();
        m5.start();
        w5.start();
        w6.start();
        m6.start();

        try {
            Thread.sleep(5000);              // let simulation run for desired time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Interrupt!");
        m1.interrupt();
        w1.interrupt();
        m2.interrupt();
        w2.interrupt();
        m3.interrupt();
        w3.interrupt();
        m4.interrupt();
        w4.interrupt();
        m5.interrupt();
        w5.interrupt();
        m6.interrupt();
        w6.interrupt();

        try {
            m1.join();
            m2.join();
            m3.join();
            m4.join();
            m5.join();
            m6.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            w1.join();
            w2.join();
            w3.join();
            w4.join();
            w5.join();
            w6.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
