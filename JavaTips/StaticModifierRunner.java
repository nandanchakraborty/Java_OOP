package JavaTips;
class Player{
    private  String name;
    //private   int count =0;

    private static  int count =0;




    public Player(String name) {
        this.name = name;
        count++;
    }

    public static int getCount() {
        return count;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class StaticModifierRunner {
    public static void main(String []args){
        Player  player1 = new Player("Messi");
        System.out.println(Player.getCount());
        Player  player2 = new Player("Neymar");
        System.out.println(Player.getCount());



    }
}
