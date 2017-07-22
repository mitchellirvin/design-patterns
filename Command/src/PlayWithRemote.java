/**
 * Created by Mitch on 11/21/2015.
 */
import java.util.ArrayList;
import java.util.List;

public class PlayWithRemote {

    public static void main( String[] args ){
        ElectronicDevice newDevice = TVRemote.getDevice();  // could also have = new Television()

        // the client creates a concrete command object (onCommand) and sets its receiver (newDevice)
        TurnTVOn onCommand  = new TurnTVOn(newDevice);

        // create an invoker (onPressed) that takes the concrete command object associated with TurnTVOn command
        DeviceButton onPressed = new DeviceButton(onCommand);

        // the invoker asks the command (onCommand) to carry out the request
        // when .press() is called, depending on onPressed's associated command, it will
        // call press() from the DeviceButton class, which in turn calls the onCommand's
        // execute(), which in turn calls on()
        onPressed.press();

        //----------------------------

        TurnTVOff offCommand  = new TurnTVOff(newDevice);

        onPressed = new DeviceButton(offCommand);

        onPressed.press();

        //-----------------------------

        TurnTVUp upCommand  = new TurnTVUp(newDevice);

        onPressed = new DeviceButton(upCommand);

        onPressed.press();
        onPressed.press();
        onPressed.press();

        //-----------------------------

        Television theTV = new Television();
        Radio theRadio = new Radio();

        List<ElectronicDevice> allDevices = new ArrayList<ElectronicDevice>();

        allDevices.add(theRadio);
        allDevices.add(theTV);

        TurnItAllOff turnOffDevices = new TurnItAllOff(allDevices);

        DeviceButton turnThemOff = new DeviceButton(turnOffDevices);

        turnThemOff.press();

        turnThemOff.pressUndo();
    }
}
