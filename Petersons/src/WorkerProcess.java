/**
 * Created by Mitch on 10/8/2015.
 */
class WorkerProcess implements Runnable {

    int id = 0; // The ID of this process
    volatile LamportMutexTwoProcesses sharedInstance; // Shared variable instance

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public WorkerProcess() {

    }

    public WorkerProcess(int id, LamportMutexTwoProcesses sharedInstance) {
        this.id = id;
        this.sharedInstance = sharedInstance;
    }

    @Override
    public void run() {

        while (true) {

            // express desire to enter cs
            this.sharedInstance.flag[this.id] = true;

            // get the id of the other process
            int otherProcessID = (this.id == 0 ? 1 : 0);

            this.sharedInstance.turn = otherProcessID;

            // wait until the other process has either not expressed any desire
            // to
            // enter cs
            // or has expressed by setting its flag[] to true but has not
            // changed
            // the turn value
            // to give preference to you since you arrived early.
            while (this.sharedInstance.flag[otherProcessID] == true
                    && this.sharedInstance.turn == otherProcessID)
                ; // busy wait

            // enter cs
            cs();

            this.sharedInstance.flag[this.id] = false;
        }

    }

    private void cs() {
        try {
            System.out.println("Process :" + this.id
                    + " entering CS. Sleeping for 1 seconds");

            Thread.currentThread().sleep(1000);
        }

        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
