/**
 * Created by Mitch on 11/21/2015.
 */
public class TurnTVOn implements Command {

    ElectronicDevice theDevice; //the receiver

    public TurnTVOn(ElectronicDevice newDevice){
        theDevice = newDevice;
    }

    @Override
    public void execute() { //one type of request, in this case it turns the device on
        theDevice.on();
    }

    public void undo(){ //another request, in this case it "undoes" the first request (turns the device off)
        theDevice.off();
    }
}
