package Object;

import Controller.Position;

public class Destroyer extends Ship {
    static int size=3;
    public Destroyer(Position pos){
        super(pos, size);
    }
}
