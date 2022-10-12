package Object;
import Object.Ressources.Position;
import Object.Ressources.Ship;

public class Cruiser extends Ship{
    static int size=4;
    String name="Cruiser";

    public Cruiser(Position pos){
        super(size, pos);
        super.name=this.name;
    }
}
