import java.util.ArrayList;
import java.util.Scanner;

public class Ship {
    public ArrayList<Position> ship = new ArrayList<>();
    private Position pos;
    
    public ArrayList <Position> setBoat(Scanner scan){            
        System.out.print("Wo soll dein U-Boot (2er) platziert werden?");
        String newpos = scan.next();
        pos = new Position(newpos);
        System.out.printf("Wie soll platziert werden [1] %c [2] %c\n",25,26);
        int way = scan.nextInt();
        switch(way){
            case 1:{
                    for (int i = 1; i>=0; i--){
                        int newx=pos.x;
                        int newy=pos.y+i;
                        if(newx<10 && newx>=0 && newy<10 && newy>=0)
                            ship.add(new Position(newx, newy));
                    }
                    break;
            }            
            case 2:{
                    for (int i = 1; i>=0; i--){
                        int newx=pos.x+i;
                        int newy=pos.y;
                        if(newx<10 && newx>=0 && newy<10 && newy>=0)
                            ship.add(new Position(newx, newy));
                    }
                    break;
            }            
        }
        return ship;
    }
    public ArrayList <Position> setShip3(Scanner scan){
        System.out.print("Wo soll dein Zerstörer (3er) platziert werden?");
        String newpos = scan.next();
        pos = new Position(newpos);
        System.out.printf("Wie soll platziert werden [1] %c [2] %c\n",25,26);
        int way = scan.nextInt();
        switch(way){
            case 1:{
                    for (int i = 2; i>=0; i--){
                        int newx=pos.x;
                        int newy=pos.y+i;
                        if(newx<10 && newx>=0 && newy<10 && newy>=0)
                            ship.add(new Position(newx, newy));
                    }
                    break;
            }            
            case 2:{
                    for (int i = 2; i>=0; i--){
                        int newx=pos.x+i;
                        int newy=pos.y;
                        if(newx<10 && newx>=0 && newy<10 && newy>=0)
                            ship.add(new Position(newx, newy));
                    }
                    break;
            }
        }
        return ship;
    }
    public ArrayList <Position> setShip4(Scanner scan){
        System.out.print("Wo soll dein Zerstörer (4er) platziert werden?");
        String newpos = scan.next();
        pos = new Position(newpos);
        System.out.printf("Wie soll platziert werden [1] %c [2] %c\n",25,26);
        int way = scan.nextInt();
        switch(way){
            case 1:{
                    for (int i = 3; i>=0; i--){
                        int newx=pos.x;
                        int newy=pos.y+i;
                        if(newx<10 && newx>=0 && newy<10 && newy>=0)
                            ship.add(new Position(newx, newy));
                    }
                    break;
            }            
            case 2:{
                    for (int i = 3; i>=0; i--){
                        int newx=pos.x+i;
                        int newy=pos.y;
                        if(newx<10 && newx>=0 && newy<10 && newy>=0)
                            ship.add(new Position(newx, newy));
                    }
                    break;
            }
        }
        return ship;
    }
    public ArrayList <Position> setShip5(Scanner scan){
        System.out.print("Wo soll dein Schlachtschiff (5er) platziert werden?");
        String newpos = scan.next();
        pos = new Position(newpos);
        System.out.printf("Wie soll platziert werden [1] %c [2] %c\n",25,26);
        int way = scan.nextInt();
        switch(way){
            case 1:{
                    for (int i = 4; i>=0; i--){
                        if(pos.x<10 && pos.x>=0 && pos.y+i<10 && pos.y+i>=0)
                            ship.add(new Position(pos.x, pos.y+i));
                    }
                    break;
            }            
            case 2:{
                    for (int i = 4; i>=0; i--){
                        int newx=pos.x+i;
                        int newy=pos.y;
                        if(newx<10 && newx>=0 && newy<10 && newy>=0)
                            ship.add(new Position(newx, newy));
                    }
                    break;
            }
        }
        return ship;
    }


    // private void addIfValid(ArrayList<Position> ship, int newx, int newy){
    //     if(newx<10 && newx>=0 && newy<10 && newy>=0)
    //         ship.add(new Position(newx, newy));
    // }
}
