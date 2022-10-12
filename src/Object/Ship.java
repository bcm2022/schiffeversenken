package Object;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import Controller.Position;

public abstract class Ship {
    //Instance Variable
    public String name;
    private Random r= new Random();
    private int line;
    public List<Position> body;

    //Constructor
    public Ship(int size, Position p, int... l){
        body = Arrays.asList(new Position[size]);
        var newpos = p;
        line = l.length >0 ? r.nextInt(2): l[0];
        body.stream().forEach(p1 -> body.set(body.indexOf(p1), line==1 ? 
                    p.x+size<10 ? new Position(newpos.x++, newpos.y) : new Position(p.x--, p.y):
                    p.y+size<10 ? new Position(newpos.x, newpos.y++) : new Position(p.x, p.y--)));
    }

    //Override´s
    @Override
    public String toString(){
        return "\n\t["+name+": "+body+"]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        return prime * result + ((body == null) ? 0 : body.hashCode());
    }
    @Override
    public boolean equals(Object obj) {
        Ship other = (Ship) obj;
        return (body.isEmpty()) && !other.body.isEmpty() ?
                false : other.body.stream().filter(p -> body.contains(p)).findFirst().isPresent();
    }
}
