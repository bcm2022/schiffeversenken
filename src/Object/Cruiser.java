package Object;
import Object.Ressources.Ship;

public class Cruiser extends Ship{
    static int size=4;
    String name="Cruiser";

    public Cruiser(){
        super(size);
        super.name=this.name;
    }
}
