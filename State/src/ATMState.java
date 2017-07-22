/**
 * Created by Mitch on 10/25/2015.
 */
public interface ATMState {

    void insertCard();

    void ejectCard();

    void insertPin(int pinEntered);

    void requestCash(int cashToWithdraw);
}


