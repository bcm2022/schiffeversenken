package Object;
import Controller.Position;

public class Cruiser extends Ship{
    static int size=4;
    String name="Cruiser";
    int maxnumber=2;


    public Cruiser(Position pos, int line){
        super(size, pos, line);
        super.name=this.name;
    }
}
