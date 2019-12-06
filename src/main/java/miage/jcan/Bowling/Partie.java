package miage.jcan.Bowling;

import java.util.ArrayList;
import java.util.List;

public class Partie {
    private List<Jeu> jeux=new ArrayList<Jeu>();

    public Partie(Jeu leJeu) {
        for(int i = 0;i<10;i++)
        {
            this.jeux.add(leJeu);
        }
        if(jeux.get(9).isSpare() )
        {
            jeux.add(leJeu);
        }
        if(jeux.get(9).isStrike())
        {
            jeux.add(leJeu);
            jeux.add(leJeu);
        }
    }

    public int calculeScore() {
        int scoreTotal = 0;
        for(int i = 0;i<10;i++)
        {
            Jeu jeuCourant = jeux.get(i);
            scoreTotal+=jeuCourant.nombreQuillesTombees();
            if(jeuCourant.isSpare())
            {
                scoreTotal+=jeux.get(i+1).nombreQuillesTombeesLancer1();
            }
            if(jeuCourant.isStrike())
            {
                scoreTotal+=jeux.get(i+1).nombreQuillesTombees()+jeux.get(i+2).nombreQuillesTombees();
            }
        }
        return scoreTotal;
    }
}
