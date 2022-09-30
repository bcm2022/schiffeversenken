public class Position{
    int x, y;

    //Constructor
    public Position (int x, int y){
        this.x = x;
        this.y = y;
    }
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

    
    @Override
    public String toString(){
        return ""+"abcdefghij".charAt(x)+(y+1);
    }
}
