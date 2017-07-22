/**
 * Created by Mitch on 10/14/2015.
 */
public class UnisexBathroom {

    int [] bathroom = {0,0};        //0th index is women in bathroom, 1st index is men in bathroom
    private int howManyWomenWantIn = 0;
    private int howManyMenWantIn = 0;
    private int manCount = 0;       //number of men that have used the bathroom
    private int womanCount = 0;

    Object bathroomLock = new Object();

    public UnisexBathroom(){

    }

    public void wantsToEnter (Person p) throws InterruptedException{
        if(p.getGender() == "man"){
            synchronized (bathroomLock){
                System.out.println("A " + p.getGender() + " wants to enter the bathroom. ");
                howManyMenWantIn++;
                System.out.println(howManyMenWantIn + " men are in line for the bathroom");
                while(bathroom[0] > 0 || howManyWomenWantIn > 0){
                    try {
                        bathroomLock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
                howManyMenWantIn--;
                System.out.println("Man entering the bathroom");
                System.out.println(howManyMenWantIn + " men are in line for the bathroom");
                bathroom[1] += 1;
                System.out.println(bathroom[1] + " men are in the bathroom");
                bathroomLock.notify();
            }
        }
        else{       //if it's a woman
            synchronized (bathroomLock){
                System.out.println("A " + p.getGender() + " wants to enter the bathroom. ");
                howManyWomenWantIn++;
                System.out.println(howManyWomenWantIn + " women want to get into the bathroom");
                while(bathroom[1] > 0){
                    try {
                        bathroomLock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
                howManyWomenWantIn--;       //decrement the line
                System.out.println("Woman entering the bathroom");
                System.out.println(howManyWomenWantIn + " women in line for the bathroom");
                bathroom[0] += 1;       //increment the number of people inside
                System.out.println(bathroom[0] + " women in the restroom.");
                bathroomLock.notify();
            }
        }
    }
    public void leavesBathroom(Person p){
        if(p.getGender() == "man"){
            synchronized (bathroomLock){
                if(bathroom[1] > 0){    //if not empty
                    System.out.println("A man is leaving the bathroom.");
                    bathroom[1] -= 1;
                }
                else{       // if empty
                    System.out.println("Trying to leave empty bathroom?");
                }
                System.out.println(bathroom[1] + " men are in the restroom");
                bathroomLock.notify();
            }
        }
        else{       //for a woman
            synchronized (bathroomLock){
                System.out.println("A woman is leaving the bathroom.");
                bathroom[0] -= 1;          //decrement number of people in bathroom
                if(bathroom[0] == 0) {       // if now empty, then change boolean
                    System.out.println("all women have left the bathroom");
                    bathroomLock.notify();
                }
                System.out.println(bathroom[0] + " women are still in the restroom");
                bathroomLock.notify();
            }
        }
    }
}
