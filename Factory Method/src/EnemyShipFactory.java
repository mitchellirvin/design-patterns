/**
 * Created by Mitch on 9/27/2015.
 */
public class EnemyShipFactory {

    public EnemyShip makeEnemyShip(String newShipType) {

        if (newShipType.equals("U")) {
            return new UFOEnemyShip();
        } else if (newShipType.equals("R")) {
            return new RocketEnemyShip();
        } else if (newShipType.equals("B")) {
            return new BigUFOEnemyShip();
        } else {
            System.out.println("Give some legit input pls");
            return null;
        }
    }
}
