package Object;
import Controller.Position;

public class Cruiser extends Ship{
    static int size=4;
    String name="Cruiser";

    public Cruiser(Position pos, int... line){
        super(size, pos, line);
        super.name=this.name;
    }
}
