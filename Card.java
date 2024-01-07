public class Card {
    
    String nom;
    String couleur; //Cartes monocolores pour l'instant


    public static void main(String[] args)
    {

    }

}

class Terrain extends Card{
    
}

class Sort extends Card{
    int[] cout = {0,0,0,0,0,0}; //[Incolore, Blanc, Noir, Rouge, Bleu, Vert]

    public Sort(String[] coutbrut){ //entrée de la forme : {2Rouge, 4Vert, 2Incolore}, peut importe l'ordre des couleurs
        
        String[] pattern = {"Incolore", "Blanc", "Noir", "Rouge", "Bleu", "Vert"};

        for (int i=0; i<coutbrut.length; i++){
            
            for (int j=0; j<pattern.length; j++){

                if (coutbrut[i].substring(1).equals(pattern[j]))
                    this.cout[j]=Character.getNumericValue(coutbrut[i].charAt(0));
            }

        }
    
    }

    
    public Sort(){}
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


