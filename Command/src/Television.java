/**
 * Created by Mitch on 11/21/2015.
 */
public class Television implements ElectronicDevice {   //receiver

    private int volume = 0;

    @Override
    public void on() {
        System.out.println("TV is ON");
    }

    @Override
    public void off() {
        System.out.println("TV is OFF");
    }

    @Override
    public void volumeUp() {
        volume++;
        System.out.println("TV Volume: " + volume);
    }

    @Override
    public void volumeDown() {
        volume--;
        System.out.println("TV Volume: " + volume);
    }
}
