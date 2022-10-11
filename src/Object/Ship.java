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
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        return  prime * result + ((body == null) ? 0 : body.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        Ship other = (Ship) obj;
        return (body == null) ?
            (other.body != null) ? 
                false : false:
            other.body.stream().filter(p -> body.contains(p)).findAny().isPresent();
    }
}
