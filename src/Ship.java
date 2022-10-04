import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ship {
    public ArrayList<Position> body;
    
    //Constructor CPU
    public Ship(int typ){
        body = new ArrayList<>();
        var r = new Random();
        int x = r.nextInt(10);
        int y = r.nextInt(10);
        var pos = new Position(x, y);
        int way = r.nextInt(2)+1;
        switch(way){
                // down
                case 1:{
                    for (int i = 0; i < typ; i++)
                        addIfValid(body, pos.x+i, pos.y);
                    break;
                }
                // right
                case 2:{
                    for (int i = 0; i < typ; i++)
                        addIfValid(body, pos.x, pos.y+i);               
                    break;
                }
        }
        checkBodySize(typ);
    }

    //Constructor Player
    public Ship(Scanner scan,int typ){
        body = new ArrayList<>();
        switch (typ){
            case 2:{
                System.out.print("Wo soll dein U-Boot (2er) platziert werden?");
                break;
            }
            case 3:{
                System.out.print("Wo soll dein Zerstörer (3er) platziert werden?");
                break;
            }
            case 4:{
                System.out.print("Wo soll dein Kreuzer(4er) platziert werden?");
                break;
            }
            case 5:{
                System.out.print("Wo soll dein Schlachtschiff (5er) platziert werden?");
                break;
            }
        }
            
        String newpos = scan.next();
        var pos = new Position(newpos);
        System.out.printf("Wie soll platziert werden [1] %c [2] %c\n",25,26);
        int way = scan.nextInt();
        switch(way){
                // down
                case 1:{
                    for (int i = 0; i < typ; i++)
                        addIfValid(body, pos.x+i, pos.y);
                    break;
                }
                // left
                case 2:{
                    for (int i = 0; i < typ; i++)
                        addIfValid(body, pos.x, pos.y+i);               
                    break;
                }
        }
        checkBodySize(scan, typ);
    }

    //Check Valid & Size
    private void checkBodySize(Scanner scan, int typ){
        if (body.size()!=typ){
            body.clear();
            body.addAll(new Ship(scan, typ).body);
        }
    }
    private void checkBodySize(int typ){
        if (body.size()!=typ){
            body.clear();
            body.addAll(new Ship(typ).body);
        }
    }
    private void addIfValid(ArrayList<Position> moves, int x, int y){
        if(x<10 && x>=0 && y<10 && y>=0)
            moves.add(new Position(x, y));
    }

}
