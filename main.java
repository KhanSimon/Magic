

public class Main {
    
    //int[6] cout{}
    public static void main(String[] args) {

    //instancation des joueurs
    Player player1 = new Player("Simon", 1);
    Player player2 = new Player("Eliot", 2);


    //message de bienvenue
    System.out.printf("Bienvenue %s, vous avez %d points de vie, vous êtes le joueur n°%d \n", player1.name, player1.pointlife, player1.playernumber);
    System.out.printf("Bienvenue %s, vous avez %d points de vie, vous êtes le joueur n°%d \n", player2.name, player2.pointlife, player2.playernumber);
  

    String []coutbrouillard = {"7Incolore","9Vert","2Noir","3Rouge"};

    Sort brouillard = new Sort(coutbrouillard);
    for (int i : brouillard.cout)
        System.out.println(i);
    


    }
}