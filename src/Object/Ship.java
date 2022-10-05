package Object;

import java.util.ArrayList;
import java.util.Arrays;

import Controller.Position;

public class Ship {
    public int size;
    private char [] direction = new char[4];
    public ArrayList<Position> body=new ArrayList<>();
    
    public Ship(Position pos, int size){
        this.size=size;
        addIfValid(body, pos.getX(), pos.getY());
        validDirection(body.get(0));
        
    }

    private void validDirection(Position pos){
        int x=pos.getX(), y=pos.getY();
        
        for(int i =0; i<4; i++)
            switch(i){
                case 0:{
                    if(x+size<10 && x+size>=0 && y<10 && y>=0)
                        direction[i]=8595;
                    break;
                }
                case 1:{
                    if(x-size<10 && x-size>=0 && y<10 && y>=0)
                        direction[i]=8593;
                    break;
                }
                case 2:{
                    if(x<10 && x>=0 && y+size<10 && y+size>=0)
                        direction[i]=8594;
                    break;
                }
                case 3:{
                    if(x<10 && x>=0 && y-size<10 && y-size>=0)
                        direction[i]=8592;
                    break;
                }
            }
    }

    //Check Valid & Size
    private void addIfValid(ArrayList<Position> al, int x, int y){
        if(x<10 && x>=0 && y<10 && y>=0)
            al.add(new Position(x, y));
    }

}
