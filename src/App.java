import java.util.Scanner;

import Object.Ship;
import Player.CPU;

public class App {
    public static void main(String[] args) throws Exception {
        var scan = new Scanner(System.in);
<<<<<<< HEAD
        var p1 = new Player(scan);
        
=======
        var p1 = new CPU();
        scan.close();
        for (Ship s : p1.fleet) {
            System.out.println(s.body);
        }
        System.out.println();
>>>>>>> 83c9fde996b0e1803be171b22eaebc31a9e3098b
        p1.showBoard();
    }
}
