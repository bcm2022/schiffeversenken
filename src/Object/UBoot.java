package Object;

import Object.Ressources.Position;
import Object.Ressources.Ship;

public class UBoot extends Ship {
    static int size=2;
    String name="U-Boot";

    public UBoot(Position p){
        super(size,p);
        super.name=this.name;
    }
}
