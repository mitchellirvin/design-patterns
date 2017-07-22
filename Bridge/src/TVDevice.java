/**
 * Created by Mitch on 11/22/2015.
 */
public class TVDevice extends EntertainmentDevice { //concrete implementor

    public TVDevice(int newDeviceState, int newMaxSetting){
        deviceState = newDeviceState;
        maxSetting = newMaxSetting;

    }

    @Override
    public void buttonFivePressed() {

        System.out.println("Channel Down");
        deviceState--;
    }

    @Override
    public void buttonSixPressed() {

        System.out.println("Channel Up");
        deviceState++;
    }
}
