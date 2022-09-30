import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var scan = new Scanner(System.in);
        var p1 = new Player(scan);
        scan.close();
        p1.showBoard();
    }
}
