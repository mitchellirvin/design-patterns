/**
 * Created by Mitch on 11/21/2015.
 */
public class StockOffer {

    private int stockShares = 0;
    private String stockSymbol = "";
    private int colleagueCode = 0;

    public StockOffer( int numOfShares, String stock, int collCode){
        stockShares = numOfShares;
        stockSymbol = stock;
        colleagueCode = collCode;

    }

    public int getStockShares(){ return stockShares; }
    public String getStockSymbol(){ return stockSymbol; }
    public int getColleagueCode(){ return colleagueCode; }

}
