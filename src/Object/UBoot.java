package Object;

import Object.Ressources.Ship;

public class UBoot extends Ship {
    static int size=2;
    String name="U-Boot";

    public UBoot(){
        super(size);
        super.name=this.name;
    }
}
