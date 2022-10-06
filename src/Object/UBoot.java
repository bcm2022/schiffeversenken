package Object;

import Controller.Position;

public class UBoot extends Ship {
    static int size=2;
    String name="U-Boot";
    int maxnumber=4;

    
    public UBoot(Position p){
        super(size,p);
        super.name=this.name;
    }
}
