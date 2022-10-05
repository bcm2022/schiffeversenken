package Object;

import java.util.ArrayList;
import java.util.Arrays;

import Controller.Position;

public abstract class Ship {
    public int size;
    private Position pos;
    public ArrayList<Position> body=new ArrayList<>();
    
    public Ship(Position pos, int size){
        this.size=size;
        this.pos=pos;
        validDirection();
    }

    public boolean setShip(int direction){
        boolean set=false;
        int x=pos.getX(), y=pos.getY();
        char [] d = validDirection();
        Arrays.sort(d);
        switch(direction){
            //left
            case 0:{
                int search = Arrays.binarySearch(d, (char)2190);
                if (search!=-1){
                    for (int i=size-1; i >= 0; i--)
                        addIfValid(x, y-i);
                    if(body.size()==size)
                        set=true;
                    else body.clear();
                }
                break;
            }
            //up
            case 1:{
                int search = Arrays.binarySearch(d, (char)2191);
                if (search!=-1)
                    for (int i=size-1; i >= 0; i--){
                        addIfValid(x-i, y);
                        if(body.size()==size)
                            set=true;
                        else body.clear();
                    }
                break;
            }
            //down
            case 2:{
                int search = Arrays.binarySearch(d, (char)2193);
                if (search!=-1){
                    for (int i=size-1; i >= 0; i--)
                        addIfValid(x+i, y);
                    if(body.size()==size)
                        set=true;
                        else body.clear();
                }
                break;
            }
            //right
            case 3:{
                int search = Arrays.binarySearch(d, (char)2192);
                if (search!=-1){
                    for (int i=size-1; i >= 0; i--)
                        addIfValid(x, y+i);
                    if(body.size()==size)
                        set=true;
                    else body.clear();
                }
                break;
            }
        }
        return set;
    }

    private char [] validDirection(){
        char [] direction = new char[4];
        int x=pos.getX(), y=pos.getY();
        
        for(int i =0; i<4; i++)
            switch(i){
                //left
                case 0:{
                    if(x<10 && x>=0 && y-size-1<10 && y-size-1>=0)
                        direction[i]=2190;
                    break;
                }
                //up
                case 1:{
                    if(x-size-1<10 && x-size-1>=0 && y<10 && y>=0)
                        direction[i]=2191;
                    break;
                }
                //down
                case 2:{
                    if(x+size-1<10 && x+size-1>=0 && y<10 && y>=0)
                        direction[i]=2193;
                    break;
                }
                //right
                case 3:{
                    if(x<10 && x>=0 && y+size-1<10 && y+size-1>=0)
                        direction[i]=2192;
                    break;
                }
            }
        return direction;
    }

    private void addIfValid(int x, int y){
        if(x<10 && x>=0 && y<10 && y>=0)
            body.add(new Position(x, y));
    }

}
