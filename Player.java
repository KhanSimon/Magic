import java.util.ArrayList;


public class Player {
    
    int playernumber ;
    int pointlife = 20;
    String name = "joueur"+playernumber;
    ArrayList<Card> deck = new ArrayList<>();
    ArrayList<Card> main = new ArrayList<>();
    ArrayList<Card> battlefield = new ArrayList<>();
    ArrayList<Card> cimetery = new ArrayList<>();



    public static void main(String[] args){

    }

    //constructeurs : 
    public Player(){}
    public Player(String name){
        this.name = name;
    }
    public Player(String name, int number){
        this.name = name;
        this.playernumber=number;
    }
}