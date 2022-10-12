package Object;

import Controller.Position;

public class Destroyer extends Ship {
    static int size=3;
    String name="Destroyer";
    
    public Destroyer(Position pos, int... line){
        super(size, pos);
        super.name=this.name;
    }
}
