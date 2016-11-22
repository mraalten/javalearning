package nl.oefen.cox;

/**
 * Created by edwincox on 15-11-2016.
 */
public class Linear extends Lening{
    private int looptijd;
    public static final String LENING_OMSCHRIJVIJNG = "Linear";

    public Linear(int bedrag, int looptijd) {
        super(bedrag);
        this.looptijd = looptijd;
    }


    @Override
    String getLeningOmschrijving() {
        return LENING_OMSCHRIJVIJNG;
    }

    @Override
    int getPrefix() {
        return looptijd;
    }

}

