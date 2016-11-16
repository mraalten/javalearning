package nl.oefen.cox;

/**
 * Created by edwincox on 15-11-2016.
 */
public class Annuiteit extends Lening {
    private  int termijnen;

    public Annuiteit(int bedrag, int termijnen) {
        super(bedrag);
        this.termijnen = termijnen;
    }

    public int getTermijnen() {
        return termijnen;
    }
}
