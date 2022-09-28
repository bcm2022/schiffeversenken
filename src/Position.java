public class Position{
    int x, y;
    public Position (int x, int y){
        this.x = x;
        this.y = y;
    }

    public Position (String newpos){
        newpos = newpos.toLowerCase();
        if (newpos.length()!=2 || newpos.length()!=3){
            throw new IllegalArgumentException("Ungültige Eingabe");
        } else if (newpos.length() ==2) {
                x = "abcdefghij".indexOf(newpos.charAt(0));
                y = "123456789".indexOf(newpos.charAt(1));
        } else if (newpos.length()==3){
                x = "abcdefghij".indexOf(newpos.charAt(0));
                y = 10;
        }
        if (x<0 || y<0)
            throw new IllegalArgumentException("Ungültiges Zeichen!");
    }
}
