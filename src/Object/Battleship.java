package Object;

import Controller.Position;

public class Battleship extends Ship{
    static int size=5;
    String name="Battleship";
    int maxnumber=1;

    
    public Battleship(Position pos, int line){
        super(size, pos, line);
        super.name=this.name;
    }
}
