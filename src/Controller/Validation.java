package Controller;

import java.util.ArrayList;
import java.util.Collection;

import Object.Ship;

public class Validation {
    ArrayList<Position> p;

    public Validation(){
        p=new ArrayList<>();
        for (int x = 0; x < 10; x++)
            for (int y = 0; y < 10; y++)
             p.add(new Position(x, y));
    }




    public boolean check(Ship s){
        boolean check = false;
        if (p.containsAll(s.body)){
            p.removeAll(s.body);
            check=true;
        }
        return check;
    }
}