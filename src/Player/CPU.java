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
        //4*2er
        for(int i=0; i<4; i++){
            var ship = new UBoot(new Position(r.nextInt(10),r.nextInt(10)));
            // addIfValid(ship);
        }
        // //3*3er
        for(int i=0; i<3; i++){
            var ship = new Destroyer(new Position(r.nextInt(10),r.nextInt(10)));
            // addIfValid(ship);
        }
        // //2*4er
        for(int i=0; i<2; i++){
            var ship = new Cruiser(new Position(r.nextInt(10),r.nextInt(10)));
            // addIfValid(ship);
        }
        // //1*5er
        for(int i=0; i<1; i++){
            var ship = new Battleship(new Position(r.nextInt(10),r.nextInt(10)));
            // addIfValid(ship);
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

        System.out.println("    1 2 3 4 5 6 7 8 9 10");
        for (int x = 0; x < board.length; x++) {
            System.out.printf("%c |",65+x);
            for (int y = 0; y < board[x].length; y++) {
                System.out.print(" "+board[x][y]);
            }
            System.out.println(" |");        
        }
        System.out.println("\n");
        
    }    
}
