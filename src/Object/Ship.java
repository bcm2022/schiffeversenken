package Object;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import Controller.Position;

public abstract class Ship {
    //Instance Variable
    String name;
    public List<Position> body=new ArrayList<>();
    Random r = new Random();
    
    //Constructor
    public Ship(int size, Position p){
        int rnd=r.nextInt(2);
        for (int i=0; i<size; i++)
            body.add(
                rnd==1 ? 
                    p.x+size<10 ? new Position(p.x+i,p.y) : new Position(p.x-i,p.y):
                    p.y+size<10 ? new Position(p.x,p.y+i) : new Position(p.x,p.y-i)
                );
    }

    @Override
    public String toString(){
        return "\n["+name+": "+body+"]";
    }

    @Override
    public boolean equals(Object obj) {
        Ship other = (Ship) obj;
        if (body == null)
            if (other.body != null)
                return false;
            else for (Position p : body)
                    if (other.body.contains(p))
                        return true;
        return false;                
    }

    

}
