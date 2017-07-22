/**
 * Created by Mitch on 11/21/2015.
 */
public class Radio implements ElectronicDevice {    //receiver

    private int volume = 0;

    @Override
    public void on() {
        System.out.println("Radio is ON");
    }

    @Override
    public void off() {
        System.out.println("Radio is OFF");
    }

    @Override
    public void volumeUp() {
        volume++;
        System.out.println("Radio Volume: " + volume);
    }

    @Override
    public void volumeDown() {
        volume--;
        System.out.println("Radio Volume: " + volume);
    }
}
