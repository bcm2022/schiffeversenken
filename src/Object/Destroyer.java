package Object;

import Controller.Position;

public class Destroyer extends Ship {
    static int size=3;
    String name="Destroyer";
    int maxnumber=3;

    
    public Destroyer(Position pos){
        super(size, pos);
        super.name=this.name;
    }
}
