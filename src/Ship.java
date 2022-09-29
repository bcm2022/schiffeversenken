import java.util.ArrayList;
import java.util.Scanner;

public class Ship {
    public ArrayList<Position> ship = new ArrayList<>();
    private Position pos;
    
    public ArrayList <Position> setBoat(Scanner scan){            
        System.out.print("Wo soll dein U-Boot (2er) platziert werden?");
        String newpos = scan.next();
        pos = new Position(newpos);
        ship.add(pos);
        System.out.printf("Wie soll platziert werden [1] %c [2] %c\n",25,26);
        int way = scan.nextInt();
        switch(way){
            case 1:{
                for (int i = 1; i < 2; i++)
                    addIfValid(ship, pos.x, pos.y+i);
                break;
            }
            case 2:{
                for (int i = 1; i < 2; i++)
                    addIfValid(ship, pos.x+i, pos.y);                
                break;
            }            
        }
        return ship;
    }
    public ArrayList <Position> setShip3(Scanner scan){
        System.out.print("Wo soll dein Zerstörer (3er) platziert werden?");
        String newpos = scan.next();
        pos = new Position(newpos);
        ship.add(pos);
        System.out.printf("Wie soll platziert werden [1] %c [2] %c\n",25,26);
        int way = scan.nextInt();
        switch(way){
            case 1:{
                for (int i = 1; i < 3; i++)
                    addIfValid(ship, pos.x, pos.y+i);
                break;
            }
            case 2:{
                for (int i = 1; i < 3; i++)
                    addIfValid(ship, pos.x+i, pos.y);               
                break;
            }            
        }
        return ship;
    }
    public ArrayList <Position> setShip4(Scanner scan){
        System.out.print("Wo soll dein Kreuzer(4er) platziert werden?");
        String newpos = scan.next();
        pos = new Position(newpos);
        System.out.printf("Wie soll platziert werden [1] %c [2] %c\n",25,26);
        int way = scan.nextInt();
        switch(way){
            case 1:{
                for (int i = 1; i < 4; i++)
                    addIfValid(ship, pos.x, pos.y+i);
                break;
            }
            case 2:{
                for (int i = 1; i < 4; i++)
                    addIfValid(ship, pos.x+i, pos.y);               
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
                for (int i = 1; i < 5; i++)
                    addIfValid(ship, pos.x, pos.y+i);
                break;
            }
            case 2:{
                for (int i = 1; i < 5; i++)
                    addIfValid(ship, pos.x+i, pos.y);               
                break;
            }             
        }
        return ship;
    }


    private void addIfValid(ArrayList<Position> moves, int newcol, int newrow){
        if(newcol<8 && newcol>=0 && newrow<8 && newrow>=0)
            moves.add(new Position(newcol, newrow));
    }
}
