import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private ArrayList <Ship> habor= new ArrayList<>();

    //Standart Spieler Konstruktor
    public Player (Scanner scan){
        //4*2er
        for(int i=1; i<=4; i++){
            var target = new Ship();
            target.setBoat(scan);
            habor.add(target);
        }
        //3*3er
        for(int i=1; i<=3; i++){
            var target = new Ship();
            target.setShip3(scan);
            habor.add(target);
        }
        //2*4er
        for(int i=1; i<=3; i++){
            var target = new Ship();
            target.setShip4(scan);
            habor.add(target);
        }
        //1*6er
        var target = new Ship();
        target.setShip6(scan);
        habor.add(target);
    }
}
