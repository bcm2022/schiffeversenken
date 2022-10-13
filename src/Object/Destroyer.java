package Object;

import Object.Ressources.Ship;

public class Destroyer extends Ship {
    static int size=3;
    String name="Destroyer";
    
    public Destroyer(){
        super(size);
        super.name=this.name;
    }
}
