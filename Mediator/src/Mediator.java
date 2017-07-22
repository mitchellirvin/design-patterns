/**
 * Created by Mitch on 11/21/2015.
 */
public interface Mediator {

    public void saleOffer(String stock, int shares, int collCode);
    public void buyOffer(String stock, int shares, int collCode);
    public void addColleague(Colleague newColleague);

}
