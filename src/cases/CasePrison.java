package cases;

import joueur.Joueur;

public class CasePrison extends Case {

    public CasePrison(int id, String nom) {
        super(id, nom);
    }

    @Override
    public void action(Joueur joueur) {
        //TODO: Autoriser le joueur à payer pour en sortir
    }

}