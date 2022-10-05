package Player;

import java.util.ArrayList;
import Controller.Position;
import Object.*;

public class Human{
    int x, y, d;
    public ArrayList <Ship> fleet= new ArrayList<>();

    public Human(){
        Ship ship;
        //4*2er
        for(int i=0; i<4; i++){
            ship = new UBoot(new Position(x, y));
            while (!ship.setShip(d));
            addShip(ship);
            // System.out.println(ship.body+"\t\t\t"+ship.getClass()+"\t");    
        }
        // //3*3er
        for(int i=0; i<3; i++){
            ship = new Destroyer(new Position(x, y));
            while (!ship.setShip(d));
            addShip(ship);
            // System.out.println(ship.body+"\t\t\t"+ship.getClass()+"\t");    
        }
        // //2*4er
        for(int i=0; i<2; i++){
            ship = new Cruiser(new Position(x, y));
            while (!ship.setShip(d));
            addShip(ship);
            // System.out.println(ship.body+"\t\t"+ship.getClass()+"\t");
        }
        // //1*5er
        for(int i=0; i<1; i++){
            ship = new Battleship(new Position(x, y));
            while (!ship.setShip(d));
            addShip(ship);
            // System.out.println(ship.body+"\t\t"+ship.getClass()+"\t");
        }
    }
    
    private void addShip(Ship s){
        check:
        while (true){
            for (Position p : s.body)
                for(Ship s1 : fleet)
                    for(Position p1 : s1.body)
                        if (p.equals(p1)){
                            if (s instanceof UBoot)
                                s = new UBoot(new Position(x,y));
                            else if (s instanceof Destroyer)
                                s = new Destroyer(new Position(x,y));
                            else if (s instanceof Cruiser)
                                s = new Cruiser(new Position(x,y));
                            else if (s instanceof Battleship)
                                s = new Battleship(new Position(x,y));
                            while (!s.setShip(d));
                            addShip(s);
                            break check;
                        }
            fleet.add(s);
            break;
        }
        
    }
    
}
