import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var scan = new Scanner(System.in);
        var p1 = new CPU();
        scan.close();
        for (Ship s : p1.fleet) {
            System.out.println(s.body);
        }
        System.out.println();
        p1.showBoard();
    }
}
