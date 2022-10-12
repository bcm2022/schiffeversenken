package Object;

import Object.Ressources.Position;
import Object.Ressources.Ship;

public class Battleship extends Ship{
    static int size=5;
    String name="Battleship";
    
    public Battleship(Position pos){
        super(size, pos);
        super.name=this.name;
    }
}
