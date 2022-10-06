import java.util.Arrays;
import java.util.Scanner;
import Player.CPU;

public class App {
    public static void main(String[] args) throws Exception {
        var scan = new Scanner(System.in);
        var p1 = new CPU();
        scan.close();
        System.out.println(p1);
    }
}
