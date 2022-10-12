package Object;

import Controller.Position;

public class UBoot extends Ship {
    static int size=2;
    String name="U-Boot";

    public UBoot(Position p, int... line){
        super(size,p);
        super.name=this.name;
    }
}
