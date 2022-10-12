package Object;

import Object.Ressources.Position;
import Object.Ressources.Ship;

public class Destroyer extends Ship {
    static int size=3;
    String name="Destroyer";
    
    public Destroyer(Position pos){
        super(size, pos);
        super.name=this.name;
    }
}
