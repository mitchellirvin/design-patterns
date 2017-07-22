/**
 * Created by Mitch on 11/21/2015.
 */
public class TurnTVOff implements Command {

    ElectronicDevice theDevice;

    public TurnTVOff(ElectronicDevice newDevice){
        theDevice = newDevice;
    }

    @Override
    public void execute() {

        theDevice.off();
    }

    public void undo(){
        theDevice.on();
    }
}
