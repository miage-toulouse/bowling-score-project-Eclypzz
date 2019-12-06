package miage.jcan.Bowling;

import org.junit.Test;

import static org.junit.Assert.*;

public class PartieTest {
    @Test
    public void testCalculeScoreSansStrikeSansSpare()
    {
        //given : une partie avec 10 jeux identiques faisant tomber 5 quilles sur les 5 lancers
        Jeu leJeu = new Jeu(5,0);
        Partie laPartie = new Partie(leJeu);
        //when : on calcule le score
        int score = laPartie.calculeScore();
        //then : on obtient un score de 50
        assertEquals(50,score);
    }

    @Test
    public void testCalculScoreAvecQueDesSpares()
    {
        //given : une partie avec 10 jeux identiques correspondants a des spares
        Jeu leJeu = new Jeu(5,5);
        Partie laPartie = new Partie(leJeu);
        //when : on calcule le score
        int score = laPartie.calculeScore();
        //then : on obtient un score de 50
        assertEquals(150,score);
    }

    @Test
    public void testCalculScoreAvecQueDesStrikes()
    {
        //given : une partie avec 10 jeux identiques correspondants a des spares
        Jeu leJeu = new Jeu(10);
        Partie laPartie = new Partie(leJeu);
        //when : on calcule le score
        int score = laPartie.calculeScore();
        //then : on obtient un score de 50
        assertEquals(300,score);
    }
}