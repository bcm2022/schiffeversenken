package Player;
import java.util.ArrayList;
import java.util.Random;

import Controller.Position;
import Object.*;

public class CPU {
    Random r = new Random();
    public ArrayList <Ship> fleet= new ArrayList<>();

    //Constructor
    public CPU (){
        Ship ship;
        
        //4*2er
        for(int i=0; i<4; i++){
            ship = new UBoot(new Position(r.nextInt(10),r.nextInt(10)));
            while (!ship.setShip(r.nextInt(4)));
            addShip(ship);
            // System.out.println(ship.body+"\t\t\t"+ship.getClass()+"\t");    
        }
        // //3*3er
        for(int i=0; i<3; i++){
            ship = new Destroyer(new Position(r.nextInt(10),r.nextInt(10)));
            while (!ship.setShip(r.nextInt(4)));
            addShip(ship);
            // System.out.println(ship.body+"\t\t\t"+ship.getClass()+"\t");    
        }
        // //2*4er
        for(int i=0; i<2; i++){
            ship = new Cruiser(new Position(r.nextInt(10),r.nextInt(10)));
            while (!ship.setShip(r.nextInt(4)));
            addShip(ship);
            // System.out.println(ship.body+"\t\t"+ship.getClass()+"\t");
        }
        // //1*5er
        for(int i=0; i<1; i++){
            ship = new Battleship(new Position(r.nextInt(10),r.nextInt(10)));
            while (!ship.setShip(r.nextInt(4)));
            addShip(ship);
            // System.out.println(ship.body+"\t\t"+ship.getClass()+"\t");
        }
    }
    
    //Battlefield
    public void showBoard(){
        var board = new char[10][10];
        //leeres Spielfeld
        for (int x=0 ; x<board.length; x++)
            for (int y=0 ; y<board[x].length; y++)
                board[x][y] = '~';
        
        for (Ship ship : fleet) {
            for (Position p : ship.body) {
                board[p.getX()][p.getY()] = (char) ship.body.size();
            }
        }

        // System.out.println("    1 2 3 4 5 6 7 8 9 10");
        // for (int x = 0; x < board.length; x++) {
        //     System.out.printf("%c |",65+x);
        //     for (int y = 0; y < board[x].length; y++) {
        //         System.out.print(" "+board[x][y]);
        //     }
        //     System.out.println(" |");        
        // }
        System.out.println("\n");
        
    }    

    private void addShip(Ship s){
        check:
        while (true){
            for (Position p : s.body)
                for(Ship s1 : fleet)
                    for(Position p1 : s1.body)
                        if (p.equals(p1)){
                            if (s instanceof UBoot)
                                s = new UBoot(new Position(r.nextInt(10),r.nextInt(10)));
                            else if (s instanceof Destroyer)
                                s = new Destroyer(new Position(r.nextInt(10),r.nextInt(10)));
                            else if (s instanceof Cruiser)
                                s = new Cruiser(new Position(r.nextInt(10),r.nextInt(10)));
                            else if (s instanceof Battleship)
                                s = new Battleship(new Position(r.nextInt(10),r.nextInt(10)));
                            while (!s.setShip(r.nextInt(4)));
                            addShip(s);
                            break check;
                        }
            fleet.add(s);
            break;
        }
        
    }
}
