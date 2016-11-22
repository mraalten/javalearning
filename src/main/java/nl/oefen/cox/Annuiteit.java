package nl.oefen.cox;

/**
 * Created by edwincox on 15-11-2016.
 */
public class Annuiteit extends Lening {
    private  int termijnenAnnuiteit;
    public static final String LENING_OMSCHRIJVIJNG = "Annuiteit";

    public Annuiteit(int bedrag, int termijnenAnnuiteit) {
        super(bedrag);
        this.termijnenAnnuiteit = termijnenAnnuiteit;
    }
    @Override
    String getLeningOmschrijving() {
        return LENING_OMSCHRIJVIJNG;
    }

    @Override
    int getPrefix() {
        return termijnenAnnuiteit;
    }


}
