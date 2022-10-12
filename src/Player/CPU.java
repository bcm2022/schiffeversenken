package Player;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import Controller.Position;
import Object.*;

public class CPU {
    Random r = new Random();
    public List <Ship> fleet = new ArrayList<>();

    //Constructor
    public CPU (){
        //4*2er
        while (fleet.stream().filter(s -> s.body.size()==2).count() <4)
           addIfvalid(new UBoot(new Position(r.nextInt(10),r.nextInt(10))));
        // //3*3er
        while (fleet.stream().filter(s -> s.body.size()==3).count() <3)
            addIfvalid(new Destroyer(new Position(r.nextInt(10),r.nextInt(10))));
        // //2*4er
        while (fleet.stream().filter(s -> s.body.size()==4).count() <2)
            addIfvalid(new Cruiser(new Position(r.nextInt(10),r.nextInt(10))));
        // //1*5er
        while (fleet.stream().filter(s -> s.body.size()==5).count() <1)
            addIfvalid(new Battleship(new Position(r.nextInt(10),r.nextInt(10))));
    }
    
    private boolean addIfvalid (Ship s){
        return fleet.stream().filter(s1 -> s1.equals(s)).findFirst().isPresent() ? false : true && fleet.add(s);
    }

    @Override
    public String toString(){
        return ""+this.getClass()+fleet;
    }
}