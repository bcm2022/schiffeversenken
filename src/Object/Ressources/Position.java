package Object.Ressources;

import java.util.Scanner;

public class Position{
    public int x, y;


    //Constructor (default)
    public Position (int x, int y){
        this.x = x;
        this.y = y;
    }
    //Constructor (Scanner)
    public Position (){
        System.out.println("Gib die Position des Schiffes an!");
        setPos();
    }
    
    public void setPos() {
        try (var scan = new Scanner(System.in)) {
            String newpos = scan.next(); 
            if (newpos.length()!=2 && newpos.length()!=3){
                throw new IllegalArgumentException("Ungültige Eingabe");
            } else {
                x = "abcdefghij".indexOf(newpos.charAt(0));
                y = "1234567890".indexOf(newpos.charAt(newpos.length()-1));
            }
        }
        if (x<0 || y<0)
            throw new IllegalArgumentException("Ungültiges Zeichen!");
        
    }

    //Overreide
    @Override
    public String toString(){
        return ""+"abcdefghij".charAt(x)+(y+1);
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        return (prime * 1 + x)*prime + (y+1);
    }
    @Override
    public boolean equals(Object obj) {
        Position other = (Position) obj;
        return this == obj ? true : obj==null || getClass() != obj.getClass() || x!=other.x || y!= other.y ? false : true;
    }

    
}