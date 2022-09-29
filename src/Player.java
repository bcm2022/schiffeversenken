import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private ArrayList <Ship> habor= new ArrayList<>();

    //Standart Spieler Konstruktor
    public Player (Scanner scan){
        //4*2er
        for(int i=1; i<=4; i++){
            var target = new Ship();
            target.setBoat(scan);
            habor.add(target);
        }
        //3*3er
        for(int i=1; i<=3; i++){
            var target = new Ship();
            target.setShip3(scan);
            habor.add(target);
        }
        //2*4er
        for(int i=1; i<=2; i++){
            var target = new Ship();
            target.setShip4(scan);
            habor.add(target);
        }
        //1*6er
        var target = new Ship();
        target.setShip5(scan);
        habor.add(target);
    }

    public void showBoard(){
        var board = new char[10][10];
        //leeres Spielfeld
        for (int x=0 ; x<board.length; x++)
            for (int y=0 ; y<board[x].length; y++)
                board[x][y] = '~';
        
        for (Ship fleet : habor) {
            for (Position p : fleet.ship) {
                board[p.x][p.y] = '#';
            }
        }

        System.out.println("   _____________________");
        for (int x = 0; x < board.length; x++) {
            System.out.printf("%c |",65+x);
            for (int y = 0; y < board[x].length; y++) {
                System.out.print(" "+board[x][y]);
            }
            System.out.println(" |");        
        }
        System.out.println("   1 2 3 4 5 6 7 8 9 10");
        
    }
}
