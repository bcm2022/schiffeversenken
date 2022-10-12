package Player;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import Controller.Position;
import Object.*;

public class nonCPU {
    Random r = new Random();
    public List <Ship> fleet = new ArrayList<>();

    //Constructor
    public nonCPU (){
        var scan = new Scanner(System.in);
        String newpos;
        int line;
        //4*2er
        while (fleet.stream().filter(s -> s.body.size()==2).count() <4){
            System.out.println("Bitte gib die Position für dein U-Boot an.");
            newpos = scan.next();
            System.out.println("Soll es [0]horizontal oder [1]vertikal gesetzt werden?");
            line = scan.nextInt();
            addIfvalid(new UBoot(new Position(newpos), line));
        }
        // //3*3er
        while (fleet.stream().filter(s -> s.body.size()==3).count() <3){
            System.out.println("Bitte gib die Position für deinen Zerstörer an.");
            newpos = scan.next();
            System.out.println("Soll es [0]horizontal oder [1]vertikal gesetzt werden?");
            line = scan.nextInt();
            addIfvalid(new Destroyer(new Position(newpos), line));
        }
        // //2*4er
        while (fleet.stream().filter(s -> s.body.size()==4).count() <2){
            System.out.println("Bitte gib die Position für deinen Kreuzer an.");    
            newpos = scan.next();
            System.out.println("Soll es [0]horizontal oder [1]vertikal gesetzt werden?");
            line = scan.nextInt();
            addIfvalid(new Cruiser(new Position(newpos), line));
        }
        // //1*5er
        while (fleet.stream().filter(s -> s.body.size()==5).count() <1){
            System.out.println("Bitte gib die Position für dein Schlachtschiff an.");
            newpos = scan.next();
            System.out.println("Soll es [0]horizontal oder [1]vertikal gesetzt werden?");
            line = scan.nextInt();
            addIfvalid(new Battleship(new Position(newpos), line));
        }
        scan.close();
    }
    
    private boolean addIfvalid (Ship s){
        return fleet.stream().filter(s1 -> s1.equals(s)).findFirst().isPresent() ? false : true && fleet.add(s);
    }

    @Override
    public String toString(){
        return ""+this.getClass()+fleet;
    }
}