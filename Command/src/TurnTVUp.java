/**
 * Created by Mitch on 11/21/2015.
 */
public class TurnTVUp implements Command {

    ElectronicDevice theDevice;

    public TurnTVUp(ElectronicDevice newDevice){
        theDevice = newDevice;
    }

    @Override
    public void execute() {

        theDevice.volumeUp();
    }

    public void undo(){
        theDevice.volumeDown();
    }
}
