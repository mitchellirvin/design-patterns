/**
 * Created by Mitch on 11/21/2015.
 */
public class DeviceButton { //the invoker

    Command theCommand;

    public DeviceButton( Command newCommand ){
        theCommand = newCommand;
    }

    public void press(){
        theCommand.execute();
    }   //asks the command to carry out the execute request

    public void pressUndo(){
        theCommand.undo();
    }  //asks the command to carry out the undo request
}
