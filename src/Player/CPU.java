package Player;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Controller.Position;
import Object.*;

public class CPU {
    Random r = new Random();
    public List <Ship> fleet;

    //Constructor
    public CPU (){
        fleet= new ArrayList<Ship>();
        // var v = new Validation();
        //4*2er
        for(int i=0; i<4; i++){
            var ship = new UBoot(new Position(r.nextInt(10),r.nextInt(10)));
            fleet.add(ship);
        }
        // //3*3er
        for(int i=0; i<3; i++){
            var ship = new Destroyer(new Position(r.nextInt(10),r.nextInt(10)));
            fleet.add(ship);
        }
        // //2*4er
        for(int i=0; i<2; i++){
            var ship = new Cruiser(new Position(r.nextInt(10),r.nextInt(10)));
            fleet.add(ship);
        }
        // //1*5er
        for(int i=0; i<1; i++){
            var ship = new Battleship(new Position(r.nextInt(10),r.nextInt(10)));
            fleet.add(ship);
        }
    }
    
    @Override
    public String toString(){
        return ""+this.getClass()+fleet;
    }
}
