package Object;
import Controller.Position;

public class Cruiser extends Ship{
    static int size=4;
    String name="Cruiser";
    int maxnumber=2;


    public Cruiser(Position pos){
        super(size, pos);
        super.name=this.name;
    }
}
