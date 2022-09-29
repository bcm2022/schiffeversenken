import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // var scan = new Scanner(System.in);
        // var p1 = new Player(scan);
        
        // p1.showBoard();
        var check = new int[10][10];

        for (int i=0; i<check.length; i++){
            for (int j = 0; j < check[i].length; j++)              
                System.out.printf(" %d%d",i,j);
            System.out.println();
            }
    }
}
