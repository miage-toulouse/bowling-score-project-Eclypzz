package miage.jcan.Bowling;

public class Jeu {
    private Integer lancer1;
    private Integer lancer2;

    public Integer nombreQuillesTombeesLancer1() {
        return lancer1;
    }

    public Integer nombreQuillesTombeesLancer2() {
        return lancer2;
    }

    public Jeu(Integer lancer1, Integer lancer2) {
        this.lancer1 = lancer1;
        this.lancer2 = lancer2;
    }

    public Jeu(Integer lancer1) {
        this.lancer1 = lancer1;
    }

    public int nombreQuillesTombees()
    {
        if(lancer2 != null)
        return lancer1+lancer2;
        else return lancer1;
    }

    public boolean isSpare()
    {
        if((nombreQuillesTombeesLancer1()<10 && (nombreQuillesTombeesLancer1() + nombreQuillesTombeesLancer2()) == 10))
        {
            return true;
        }
        return false;
    }

    public boolean isStrike()
    {
        if(nombreQuillesTombeesLancer1() == 10)
        {
            return true;
        }
        return false;
    }


}
