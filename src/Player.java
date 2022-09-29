import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private ArrayList <Ship> fleet= new ArrayList<>();

    //Standart Spieler Konstruktor
    public Player (Scanner scan){
        //4*2er
        for(int i=1; i<=4; i++){
            var ship = new Ship();
            ship.setBoat(scan);
            for (Ship s : fleet)
            if (s.ship.equals(ship.ship)) continue;
            fleet.add(ship);
        }
    //     //3*3er
    //     for(int i=1; i<=3; i++){
    //         var ship = new Ship();
    //         ship.setShip3(scan);
    //         fleet.add(ship);
    //     }
    //     //2*4er
    //     for(int i=1; i<=2; i++){
    //         var ship = new Ship();
    //         ship.setShip4(scan);
    //         fleet.add(ship);
    //     }
    //     //1*6er
    //     var ship = new Ship();
    //     ship.setShip5(scan);
    //     fleet.add(ship);
    }

    public void showBoard(){
        //Schlachtfeld erstellen
        var board = new char[10][10];

        //leere Felder befüllen
        for (int x=0 ; x<board.length; x++)
            for (int y=0 ; y<board[x].length; y++)
                board[x][y] = '~';

        //Flotte platzieren
        for (Ship s : fleet) {
            for (Position p : s.ship) {
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
