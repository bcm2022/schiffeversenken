package Object;

import Object.Ressources.Ship;

public class Battleship extends Ship{
    static int size=5;
    String name="Battleship";
    
    public Battleship(){
        super(size);
        super.name=this.name;
    }
}
