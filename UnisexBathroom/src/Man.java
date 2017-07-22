/**
 * Created by Mitch on 10/14/2015.
 */
public class Man extends Thread implements Person {

    private String gender = "man";
    UnisexBathroom u;

    public Man(UnisexBathroom u){

        this.u = u;
    }

    public void run(){
        while(!Thread.interrupted()){
            try {
                u.wantsToEnter(this);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            try{
                sleep(1000);
            }
            catch(InterruptedException e){
                Thread.currentThread().interrupt();
                return;
            }
            u.leavesBathroom(this);
            try{
                sleep(250);
            }
            catch(InterruptedException e){
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    public String getGender(){
        return gender;
    }

}
