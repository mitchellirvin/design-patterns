/**
 * Created by Mitch on 10/8/2015.
 */
public class LamportMutexTwoProcesses {

    boolean[] flag = new boolean[2];
    int turn;

    public LamportMutexTwoProcesses() {
        flag[0] = false;
        flag[1] = false;

        turn = 1;
    }

    public static void main(String[] args) {

        LamportMutexTwoProcesses sharedVariable = new LamportMutexTwoProcesses();

        WorkerProcess p1 = new WorkerProcess(0, sharedVariable);
        WorkerProcess p2 = new WorkerProcess(1, sharedVariable);

        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);

        // start the threads
        t1.start();
        t2.start();

    }

}