/**
 * Created by Mitch on 9/28/2015.
 */
public interface Flys {
    String fly();
}

class ItFlys implements Flys{
    public String fly(){
        return "Flying High";
    }
}

class CantFly implements Flys{
    public String fly(){
        return "Can't Fly.";
    }
}