public class Card {
    
    String nom;
    String couleur;

    public static void main(String[] args)
    {

    }

}

class Terrain extends Card{
    String couleur;
}

class Sort extends Card{
    int[] cout = new int[6]; //[Incolore, Blanc, Noir, Rouge, Bleu, Vert]
}

class Creature extends Sort{
    int force;
    int endurance;
}

class Rituel extends Sort{
    
}

class Enchantement extends Sort{

}

class Ephemere extends Sort{

}


