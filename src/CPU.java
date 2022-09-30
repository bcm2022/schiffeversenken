import java.util.ArrayList;

public class CPU {
    public ArrayList <Ship> fleet= new ArrayList<>();

    //Constructor
    public CPU (){
        //4*2er
        for(int i=0; i<4; i++){
            var ship = new Ship(2);
            addIfValid(ship);
        }
        // //3*3er
        for(int i=0; i<3; i++){
            var ship = new Ship(3);
            addIfValid(ship);
        }
        // //2*4er
        for(int i=0; i<2; i++){
            var ship = new Ship(4);
            addIfValid(ship);
        }
        // //1*5er
        for(int i=0; i<1; i++){
            var ship = new Ship(5);
            addIfValid(ship);
        }
    }
    
    private void addIfValid( Ship newship){
        for (Position p2 : newship.body)
            for (Ship ship : fleet) {
                for (Position p : ship.body){
                    if (p.equals(p2)){
                        newship = new Ship(newship.body.size());
                    }
                }
        }
        fleet.add(newship);
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
                board[p.x][p.y] = (char) ship.body.size();
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
