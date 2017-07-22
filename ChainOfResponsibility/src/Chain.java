/**
 * Created by Mitch on 11/22/2015.
 */
public interface Chain {

    public void setNextChain(Chain nextChain);

    public void calculate(Numbers request);

}
