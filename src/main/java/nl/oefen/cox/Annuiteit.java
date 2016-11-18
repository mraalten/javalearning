package nl.oefen.cox;

/**
 * Created by edwincox on 15-11-2016.
 */
public class Annuiteit extends Lening {
    private  int termijnenAnnuiteit;

    public Annuiteit(int bedrag, int termijnenAnnuiteit) {
        super(bedrag);
        this.termijnenAnnuiteit = termijnenAnnuiteit;
    }
}
