package Controller;
public class Position{
    public int x, y;


    //Constructor (default)
    public Position (int x, int y){
        this.x = x;
        this.y = y;
    }
    //Constructor (String)
    public Position (String newpos){
        newpos = newpos.toLowerCase();
        if (newpos.length()!=2 && newpos.length()!=3){
            throw new IllegalArgumentException("Ungültige Eingabe");
        } else
            x = "abcdefghij".indexOf(newpos.charAt(0));
            y = "1234567890".indexOf(newpos.charAt(newpos.length()-1));
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
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Position other = (Position) obj;
        if (x != other.x)
            return false;
        if (y != other.y)
            return false;
        return true;
    }
    
}
