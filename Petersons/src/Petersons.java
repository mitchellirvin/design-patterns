/**
 * Created by Mitch on 10/8/2015.
 */
import java.util.Arrays;

public class Petersons {
    int FALSE = 0;
    int TRUE = 1;
    int N = 2;

    int turn;
    int [] interested = {FALSE,FALSE};


    public void enter_region(int process){

        int other;
        other = 1 - process;
        interested[process] = TRUE;
        turn = process;
        while(turn == process && interested[other] == TRUE)
            ;
        criticalSection();
    }

    public void criticalSection(){
        System.out.println("critical section");
    }

    public void leave_region(int process){
        interested[process] = FALSE;
    }

    public int getTurn(){
        return turn;
    }
    public int getInterested(int n){
        return interested[n];
    }

}
