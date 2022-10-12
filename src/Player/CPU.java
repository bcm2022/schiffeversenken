package Player;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import Controller.Position;
import Object.*;

public class CPU {
    Random r = new Random();
    public List <Ship> fleet;

    //Constructor
    public CPU (){
        fleet= new ArrayList<Ship>();

        //4*2er
        for(int i=0; i<4; i++){
            i-=addIfvalid(new UBoot(new Position(r.nextInt(10),r.nextInt(10)), r.nextInt(2)));
        }
        // //3*3er
        for(int i=0; i<3; i++){
            i-=addIfvalid(new Destroyer(new Position(r.nextInt(10),r.nextInt(10)), r.nextInt(2)));
        }
        // //2*4er
        for(int i=0; i<2; i++){
            i-=addIfvalid(new Cruiser(new Position(r.nextInt(10),r.nextInt(10)), r.nextInt(2)));
        }
        // //1*5er
        for(int i=0; i<1; i++){
            i-=addIfvalid(new Battleship(new Position(r.nextInt(10),r.nextInt(10)), r.nextInt(2)));
        }
    }
    
    private int addIfvalid (Ship s){
        for (Ship s1 : fleet)
            if (s1.equals(s))
                return 1;                
        fleet.add(s);
        return 0;
    }

    @Override
    public String toString(){
        return ""+this.getClass()+fleet;
    }
}
